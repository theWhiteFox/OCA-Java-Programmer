import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class GitCommit  
{
	public static void main (String [] args)
	{
		// try(BufferedReader br = new BufferedReader(new FileReader("emoji.txt")))
		// {
			
		// 	String sCurrentLine;
						
		// 	List<String> emoji = new ArrayList<String>();
			
			
		// 	while((sCurrentLine = br.readLine()) != null)
		// 	{
				
				
		// 		emoji.add(sCurrentLine.nextLine());				
		// 		// emoji.add(sCurrentLine.split(","));			
				
		// 		System.out.println();
				
		// 		// emoji.add(br.readLine()); 
				
		// 		// for(String emojie : emoji)
		// 		// {
		// 		// 	System.out.println(emojie);
		// 		// }
				
				
		// 		// Random random = new Random();
		// 		// System.out.println(emoji.size());
		// 		// System.out.println(sCurrentLine);
				
		
		// 		// String randomPick1 = random.nextInt(emoji.size());
		// 		// String randomPick2 = emoji[random.nextInt(emoji.length)];
		
		// 		// System.out.println(":" + randomPick1 + ":");	
				
		// 	}
		// }
		// catch(IOException e)
		// {
		// 	e.printStackTrace();
		// }
		
		Scanner scanner = new Scanner(System.in);
		
		String gitCommit;
		
		System.out.println("Enter git commit");
		
		gitCommit = scanner.nextLine(); 
		
		System.out.println(gitCommit);		
		
		String [] emojiArr = 
		{
			"bowtie","smile","laughing","blush","smiley","relaxed","smirk","heart_eyes","kissing_heart","kissing_closed_eyes","flushed","relieved","satisfied","grin","wink","stuck_out_tongue_winking_eye","stuck_out_tongue_closed_eyes","grinning","kissing","kissing_smiling_eyes","stuck_out_tongue","sleeping","worried","frowning","anguished","open_mouth","grimacing","confused","hushed","expressionless","unamused","sweat_smile","sweat","disappointed_relieved","weary","pensive","disappointed","confounded","fearful","cold_sweat","persevere","cry","sob","joy","astonished","scream","neckbeard","tired_face","angry","rage","triumph","sleepy","yum","mask","sunglasses","dizzy_face","imp","smiling_imp","neutral_face","no_mouth","innocent","alien","yellow_heart","blue_heart","purple_heart","heart","green_heart","broken_heart","heartbeat","heartpulse","two_hearts","revolving_hearts","cupid","sparkling_heart","sparkles","star","star2","dizzy","boom","collision","anger","exclamation","question","grey_exclamation","grey_question","zzz","dash","sweat_drops","notes","musical_note","fire","hankey","poop","shit","+1","thumbsup","-1","thumbsdown","ok_hand","punch","facepunch","fist","v","wave","hand","raised_hand","open_hands","point_up","point_down","point_left","point_right","raised_hands","pray","point_up_2","clap","muscle","metal","fu","runner","running","couple","family","two_men_holding_hands","two_women_holding_hands","dancer","dancers","ok_woman","no_good","information_desk_person","raising_hand","bride_with_veil","person_with_pouting_face","person_frowning","bow","couplekiss","couple_with_heart","massage","haircut","nail_care","boy","girl","woman","man","baby","older_woman","older_man","person_with_blond_hair","man_with_gua_pi_mao","man_with_turban","construction_worker","cop","angel","princess","smiley_cat","smile_cat","heart_eyes_cat","kissing_cat","smirk_cat","scream_cat","crying_cat_face","joy_cat","pouting_cat","japanese_ogre","japanese_goblin","see_no_evil","hear_no_evil","speak_no_evil","guardsman","skull","feet","lips","kiss","droplet","ear","eyes","nose","tongue","love_letter","bust_in_silhouette","busts_in_silhouette","speech_balloon","thought_balloon","feelsgood","finnadie","goberserk","godmode","hurtrealbad","rage1","rage2","rage3","rage4","suspect","trollface"
		};
		
		Random random = new Random();
		
		String randomPick1 = emojiArr[random.nextInt(emojiArr.length)];
		String randomPick2 = emojiArr[random.nextInt(emojiArr.length)];
		
		System.out.println(":" + randomPick1 + ": " + gitCommit + " :" + randomPick2 + ":");				
	}
}