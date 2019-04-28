package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. 
 * It was my favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {

		int score = 0;
		speak("mandelbrot");
		
		String answer = JOptionPane.showInputDialog("Spell the word: ");
		if (answer.contains("mandelbrot")) {
			speak("correct");
			score++;
		} else {
			speak("wrong");
			score--;
		}
		speak("Party");
	
		String answer2 = JOptionPane.showInputDialog("Spell the word: ");
		if (answer2.contains("Party")) {
			speak("correct");
			score++;
		} else {
			speak("wrong");
			score--;
		}
		speak("Popokateptl");
	
		String answer3 = JOptionPane.showInputDialog("Spell the word: ");
		if (answer3.contains("Popokateptl")) {
			speak("correct");
			score++;
		} else {
			speak("wrong");
			score--;
		}
		speak("Football");

		String answer4 = JOptionPane.showInputDialog("Spell the word: ");
		if (answer4.contains("Football")) {
			speak("correct");
			score++;
		} else {
			speak("wrong");
			score--;
		}

	
		
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
