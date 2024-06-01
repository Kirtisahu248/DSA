import java.util.Scanner;

public class CharacterHashing {
    // Case 1 - If the string contains only lowercase letters: In this case, we can map the characters like:  ‘a’ -> 0, ‘b’ -> 1, ‘c’ -> 2,....., ‘z’ -> 25. 

    // In order to get the corresponding value for a character, we will use the following formula: corresponding value = given character - 'a' 

    /*So, for character hashing in this case,
        we need a hash array of size 26.
        step 1 : And while pre-storing we will do hash[s[i]-’a’] += 1 instead of hash[arr[i]] += 1
        
        step 2: while fetching we will do hash[character-’a’] instead of hash[number]. The rest of the methods will be as same as in the case of number hashing. */
    
    //Case 2 - for Upper case corresponding value = given character - 'A'

    //Case 3 - If the string contains both uppercase and lowercase letters: We have 256 characters in total in this case. So, we will create a hash array of size 256. We will not subtract anything from the given character and will use the character as it is, to access the hash array while pre-storing and fetching. For pre-storing hash[s[i]] += 1 and for fetching we will use hash[character] only. The rest of the process will be exactly the same as in the number hashing.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //precompute
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
           hash[s.charAt(i)-'a']+=1;
        }
        int q;
        q = sc.nextInt();
        while(q--!=0){
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }
}
