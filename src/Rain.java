class Rain {
    public static void main(String[]args) throws InterruptedException{
        
        String [][] rain = {
            {"   _       .."},
            {" (   )   (   )"},
            {"(______) (____)"},
            {" ‚‘‚‘‚‘‚‘  "},
            {"‚’‚’‚’‚’   "},
             {" ‚‘‚‘‚‘‚‘  "},
            {"‚’‚’‚’‚’   "},
             {" ‚‘‚‘‚‘‚‘  "},
            {"‚’‚’‚’‚’   "},
            { " ‚‘‚‘‚‘‚‘  "},
          { "‚’‚’‚’‚’  "},
          {"KC"}
        };
        
        String [] snoopy={

        "        /----- \\        ",
    "   / - - / X X \\      ",
     "  XX             \\  |       ",
    "   \\————--\\-|       ",
        "     |. XXXXXXXX\\        ",
      "     /         | \\    ",
         "    /          | |        ",
      "    |             \\    |X            ",
         "     \\            \\ |XX ",      
          "      \\---- — —// XX     ",
          "            KC     "
        };

        while (true){
            
            PRINTRAIN(rain);
            PRINTSNOOPY(snoopy);
            pause();
            PRINT();
        }

    }
    public static void PRINT(){
        System.out.println();
    }

    public static void PRINTRAIN(String [][] rain){
        for (int i = 0; i < rain.length; i++){
            System.out.println(rain[i][0]);
        }
    }

    public static void PRINTSNOOPY(String [] snoopy){
        for (int i = 0; i < snoopy.length; i++){
            System.out.println(snoopy[i]);
        }
    }

    public static void pause() throws InterruptedException{
       Thread.sleep(300);
    }

}