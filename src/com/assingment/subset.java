package com.assingment;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        subseq("", "abc");
       // System.out.println(subseqAsciiRet("", "abc"));
    }

    private static void subseq(java.lang.String p, java.lang.String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    }

 
