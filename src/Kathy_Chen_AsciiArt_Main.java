class Kathy_Chen_AsciiArt_Main {
    public static void main(String[]args) throws Exception{
        
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
            PRINTWOODSTOCK(getWoodstock());
            PRINTGIRAFFE(getElephant());
            PRINTTOTORO(getTotoro());
            pause();
            PRINT();
        }

    }
    public static void PRINT(){
        System.out.println();
    }

    public static void PRINTRAIN(String [][] rain) throws InterruptedException{
        for (int i = 0; i < rain.length; i++){
            System.out.println(rain[i][0]);
            pause();
        }
    }

    public static void PRINTSNOOPY(String [] snoopy) throws InterruptedException{
        for (int i = 0; i < snoopy.length; i++){
            System.out.println(snoopy[i]);
            pause();
        }
    }

    public static void pause() throws InterruptedException{
       Thread.sleep(100);
    }

    // Sofia's woodstock ascii art
    static char [][] getWoodstock(){
         char[][] arr = new char[10][10];

        for (int y = 0; y < arr[0].length; y++) {
            for (int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }

        arr[2][2] = '_';
        arr[3][2] = '(';
        arr[4][2] = '\\';
        arr[5][2] = '(';
        arr[6][2] = '_';
        arr[2][3] = '<';
        arr[5][3] = '\'';
        arr[6][3] = '_';
        arr[7][3] = ')';
        arr[3][4] = ')';
        arr[5][4] = '(';
        arr[2][5] = '<';
        arr[3][5] = '/';
        arr[6][5] = ')';
        arr[4][6] = '√';
        arr[5][6] = '√';
        arr[7][7] = 'S';
        arr[8][7] = 'C';


        return arr;
    }



    // lark's elephant

    static char[][] getElephant() {
          char[][] img = new char[7][50];
          // fill with empty space
          for (int y = 0; y < 7; y++) {
              for (int x = 0; x < 50; x++) {
            img[y][x] = ' ';
              }
          }
          // then fill individual characters
         img[0][38] = '_';
         img[0][39] = '_';
         img[0][45] = '_';
         img[0][46] = '_';
         img[1][40] = '\\';
         img[1][41] = '~';
         img[1][42] = '~';
         img[1][43] = '~';
         img[1][44] = '/';
         img[1][47] = '\\';
         img[2][33] = '\'';
         img[2][34] = '-';
         img[2][35] = '-';
         img[2][36] = '-';
         img[2][37] = '-';
         img[2][38] = '(';
         img[2][42] = '.';
         img[2][43] = '.';
         img[2][48] = ')';
         img[3][32] = '/';
         img[3][49] = '\\';
         img[3][40] = '_';
         img[3][41] = '_';
         img[3][44] = '_';
         img[3][45] = '_';
         img[4][31] = '/';
         img[4][32] = '|';
         img[4][42] = '\\';
         img[4][44] = '|';
         img[4][45] = '(';
         img[5][30] = '/';
         img[5][32] = '\\';
         img[5][37] = '/';
         img[5][39] = '\\';
         img[5][42] = '/';
         img[5][43] = '\\';
         img[5][44] = '|';
         img[5][45] = '(';
         img[6][30] = '^';
         img[6][32] = '|';
         img[6][34] = '_';
         img[6][35] = '_';
         img[6][37] = '|';
         img[6][40] = '|';
         img[6][41] = '_';
         img[6][42] = '_';
         img[6][43] = '|';
         img[6][44] = '-';
         img[6][45] = '"';
         



      




         return img;
       }

    // using Sofia's code
     public static void PRINTWOODSTOCK(char [][] woodstock) throws InterruptedException{
        for (int y = 0; y < woodstock[0].length; y++) {
            for (int x = 0; x < woodstock.length; x++) {
                System.out.print(woodstock[x][y]);
            }
            System.out.println();
            pause();
        }

    }

       public static void PRINTGIRAFFE(char [][] giraffe) throws InterruptedException{
        for (int i = 0; i < giraffe.length; i++){
            System.out.println(giraffe[i]);
            pause();
        }
    }

    // using Caroline's code for Totoro

static char [][] getTotoro() {
        char[][] img = new char[16][29];
        for (int y = 0; y < 16; y++){
            for (int x = 0; x < 29; x++) {
                img[y][x] = ' ';
            }
        }
        //individual character
        img[0][9]  ='/';
        img[0][10] = '\\';
        img[0][18] = '/';
        img[0][19] = '\\';
        img[1][8] = '/';
        img[1][9] = '|';
        img[1][10] = '|';
        img[1][11] = '\\';
        img[1][17] = '/';
        img[1][18] = '|';
        img[1][19] = '|';
        img[1][20] = '\\';
        img[2][8] = '.';
        img[2][9] = '.';
        img[2][10] = '-';
        img[2][11] = '-';
        img[2][12] = '-';
        img[2][13] = '-';
        img[2][14] = '-';
        img[2][15] = '-';
        img[2][16] = '-';
        img[2][17] = '-';
        img[2][18] = '-';
        img[2][19] = '.';
        img[2][20] = '.';
        img[3][6] = '.';
        img[3][7] = '\'';
        img[3][21] = '\'';
        img[3][22] = '.';
        img[4][6] = '/';
        img[4][8] = '(';
        img[4][9] = '*';
        img[4][10] = ')';
        img[4][14] = 'v';
        img[4][18] = '(';
        img[4][19] = '*';
        img[4][20] = ')';
        img[4][22] = '\\';
        img[4][25] = '.';
        img[4][26] = '-';
        img[4][27] = '-';
        img[4][28] = '.';
        img[5][6] = '|';
        img[5][11] = '\'';
        img[5][12] = '_';  
        img[5][13] = '_';
        img[5][14] = '_';
        img[5][15] = '_';
        img[5][16] = '_';  
        img[5][17] = '\'';
        img[5][22] = '|';
        img[5][24] = '/';
        img[5][28] = '|';
        img[6][7] = '\\';
        img[6][21] = '/';
        img[6][22] = '-';
        img[6][23] = '\'';
        img[6][27] = '.';
        img[6][28] = '\'';
        img[7][4] = '.';
        img[7][5] = '-';
        img[7][6] = '\'';
        img[7][8] = '\'';
        img[7][9] = '\'';
        img[7][10] = '-';
        img[7][11] = '.';
        img[7][12] = '.';
        img[7][13] = '-';
        img[7][14] = '-';
        img[7][15] = '-';
        img[7][16] = '.';
        img[7][17] = '.';
        img[7][18] = '-';
        img[7][19] = '\'';
        img[7][21] = '\'';
        img[7][26] = '/';
        img[8][3] = '/';
        img[8][9] = '.';
        img[8][10] = '\'';
        img[8][12] = '^';
        img[8][14] = '^';
        img[8][16] = '^';
        img[8][18] = '\'';
        img[8][19] = '.';
        img[8][24] = '.';
        img[8][25] = '\'';
        img[9][2] = '/';
        img[9][8] = '/';
        img[9][10] ='^';
        img[9][12] = '^';
        img[9][14] = '^';
        img[9][16] = '^';
        img[9][18] = '^';
        img[9][20] = '\\';
        img[9][23] = '/';
        img[10][2] = '|';
        img[10][5] = '|';
        img[10][7] = '|';
        img[10][21] = '|';
        img[10][23] = '|';
        img[11][2] = '\'';
        img[11][3] = '-';
        img[11][4] = '.';
        img[11][5] = '|';
        img[11][7] = '|';
        img[11][21] = '|';
        img[11][23] = '|';
        img[12][6] = '\\';
        img[12][8] = '\\';
        img[12][20] = '/';
        img[12][22] = '/';
        img[13][7] = '\\';
        img[13][9] = '\'';
        img[13][10] = '.';
        img[13][18] = '.';
        img[13][19] = '\'';
        img[13][21] = '/';
        img[14][8] = '\\';
        img[14][11] = '\'';
        img[14][12] = '\'';
        img[14][13] = '-';
        img[14][14] = '-';
        img[14][15] = '-';
        img[14][16] = '\'';
        img[14][17] = '\'';
        img[14][20] = '/';
        img[15][7] = '.';
        img[15][8] = '\'';
        img[15][9] = '_';
        img[15][10] = '_';
        img[15][11] = '_';
        img[15][12] = '_';
        img[15][13] = '/';
        img[15][14] = '-';
        img[15][15] = '\\';
        img[15][16] = '_';
        img[15][17] = '_';
        img[15][18] = '_';
        img[15][19] = '_';
        img[15][20] = '\'';
        img[15][21] = '.';
        img[15][25] = 'C';
        img[15][26] = 'K';
        return img;
    }

     public static void PRINTTOTORO(char [][] totoro) throws InterruptedException{
        for (int i = 0; i < totoro.length; i++){
            System.out.println(totoro[i]);
            pause();
        }
  }
}
    