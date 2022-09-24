package com.learn.lambda;

import java.util.List;
import java.util.function.Predicate;

public class RQ10 {

       public void remove(List<Character> chars)
        {
            char end = 'z';
           //char start = 'a';//Does not compile
            //char c = 'x';//Does not compile. a and c can not be redifined in lambda
            chars = null;//compile because it is not used.
            //end = '1';//Does not compile. end must be effectively final or final variable as they used in lambda
            Predicate<Character> predicate = c -> {char start = 'a'; return start<=c && c<=end; };
            char start = 'a';//compile
            char c = 'x';//compile, here start and c compiled wel because the scope of lambda is over.
            chars = null;
           // end = '1';//Does not compile should be effectively final


        }


}
