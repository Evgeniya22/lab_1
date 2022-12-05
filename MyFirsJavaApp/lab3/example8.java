package lab3;


public class example8

{
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size];
        char i = 'A';
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int x = 0; x < chars.length; i++)
        {
            for (int y = 0; y < ExChars.length; y++)
            {
                if (i == ExChars[y]) {
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("Элемент массива ["+x+"] = " + chars[x]);
            x++;
        }
        System.out.println("конец массива\n");
    }
}
