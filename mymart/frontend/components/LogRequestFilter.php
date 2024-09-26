<?php

namespace app\components;

use Yii;
use app\models\Statistic;
use yii\base\ActionFilter;

class LogRequestFilter extends ActionFilter
{
    public function beforeAction($action)
    {
        $request = Yii::$app->request;

        $userIp = $request->userIP;
        $userHost = gethostbyaddr($userIp);
        $accessTime = date('Y-m-d H:i:s');
        $pathInfo = $request->pathInfo;
        $queryString = $request->queryString;

        $statistic = new Statistic();
        $statistic->access_time = $accessTime;
        $statistic->user_ip = $userIp;
        $statistic->user_host = $userHost;
        $statistic->path_info = $pathInfo;
        $statistic->query_string = $queryString;
        $statistic->save(false); // Save the model without validation

        return parent::beforeAction($action);
    }
}
