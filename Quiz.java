public static String scrambleWord(String word){
  /* To be implemented in part (a) */
    String equalsA = "A";
    String notA = word;

  for(int i = 0; i < word.length()-1; i++)
    
    if(i.equals("A") && (!(i.equals("A")+1)))
      return notA + equalsA;
    else
      return word;
  
    
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */

  for(int i = wordList.length()-1; i >= 0; i--)
    if(wordList.get(i).equals(scrambleWord()))
      wordList.remove(i);
    else
      wordList.scrambleWord(i);

    return wordList;
}
