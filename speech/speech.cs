using System;
using System.Speech.Recognition;
class SpeechRecog
{
	static void Main()
	{
      		SpeechRecognizer recognizer = new SpeechRecognizer();
      		Choices colors = new Choices();
      		colors.Add(new string[] { "red", "green", "blue" });
	      	GrammarBuilder gb = new GrammarBuilder();
		gb.Append(colors);
	        Grammar g = new Grammar(gb);
		recognizer.LoadGrammar(g);
      		recognizer.SpeechRecognized +=new EventHandler<SpeechRecognizedEventArgs>(sre_SpeechRecognized);
		Console.ReadLine();
	}
	static void sre_SpeechRecognized(object sender, SpeechRecognizedEventArgs e)
    	{
      		Console.WriteLine("Speech recognized: " + e.Result.Text);
    	}
}