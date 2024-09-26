public class Sentence{
	String sentence;
	
	Sentence(String sentence){
		this.sentence = sentence;
	}

	public void swap(String findWord, String substituteWord){
		this.sentence = this.sentence.replace(findWord, substituteWord);
	}

	String getSentence(){
		return sentence;
	}
}