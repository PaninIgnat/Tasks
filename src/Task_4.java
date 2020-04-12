
        import java.io.*;
        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.util.Scanner;

        Задание №9: Ввод/вывод данных для массива
public class Task_9 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введте длинну массива:");
        String[] length = new String[Integer.parseInt(reader.readLine())];


        System.out.println("Заполните массив:");
        for (int i = 0; i < length.length; i++) {
            length[i] = reader.readLine();
        }


        for (int i = 0; i < length.length; i++) {
            int s = Integer.parseInt(length[i]);
            System.out.println(s * 2);
        }
    }


    Задание №10:Ввод/
    вывод данных
    для матрицы


    public class Task_10 {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введте длинну массива:");
            String[][] length = new String[Integer.parseInt(reader.readLine())][Integer.parseInt(reader.readLine())];


            System.out.println("Заполните массив:");
            for (int i = 0; i < length.length; i++) {
                for (int j = 0; j < length.length; j++) {
                    length[i][j] = reader.readLine();
                }
            }

            for (int j = 0; j < length.length; j++) {
                int s = Integer.parseInt(length[0][j]);
                System.out.print(s * 3 + " ");

            }
        }
    }


    Задача №11: Ввод строки с клавиатуры:

    public class Task_11 {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите строку:");
            String r = reader.readLine();
            System.out.println(r);
        }
    }

    Задача №12:
    Удаление всех
    пробелов в
    заданном текстеЗадание

    public class Task_12 {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите строку:");

            String r = reader.readLine();
            r = r.replace(" ", "");

            System.out.println(r);
        }
    }

    Задача №13:
    Сравнение двух
    строк

    public class Task_13 {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите строку:");
            String r = reader.readLine();
            String s = reader.readLine();

            if (r.length() > s.length()) {
                System.out.println(r);
            } else if (r.length() < s.length()) {
                System.out.println(s);
            } else {
                System.out.println("равны");
            }
        }
    }


    Задача №14:
    Преобразование типов:

    public class Task_14 {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите число:");
            String S = reader.readLine();
            int X = Integer.parseInt(S);
            double Y = X;
            System.out.println(S);
            System.out.println(X);
            System.out.println(Y);
        }
    }


    Задача №15: Сортировка данных в массивеЗадание

    public class Task_15 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите длинну массива:");
            Integer[] length = new Integer[Integer.parseInt(reader.readLine())];

            System.out.println("Заполните массив:");
            for (int i = 0; i < length.length; i++) {
                length[i] = Integer.parseInt(reader.readLine());
            }

            for (int i = length.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (length[j] > length[j + 1]) {
                        int tmp = length[j];
                        length[j] = length[j + 1];
                        length[j + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < length.length; i++) {
                int s = length[i];
                System.out.println(s + " ");
            }
        }
    }


    Задача №16: Выгрузка данных из файла на экранЗадание

    public class Task_16 {
        public static void main(String[] args) throws IOException {
            String s;

            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Игнат/Desktop/rer.txt"))) {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException exc) {
                System.out.println("exception" + ":" + exc);
            }
        }
    }


    Задача №17: Запись данных в файл

    public class Task_17 {
        public static void main(String[] args) throws IOException {
            String str;
            BufferedReader br = new BufferedReader(InputStreamReader(System.in));
            System.out.println("введите СТОП чтоб закончить ввод строк: ");

            try (FileWriter fw = new FileWriter("test.txt")) {
                do {
                    System.out.println(": ");
                    str = br.readLine();

                    if (str.compareTo("СТОП") == 0) break;
                    fw.write(str);
                    str = str + "\r\n";


                } while (str.compareTo("СТОП") != 0);
            } catch (IOException e) {
                System.out.println("EXCEPTION:  " + e);
            }
        }
    }


    Задача №18: Запись данных в файл

    public static void main(String[] args) throws IOException {


        String s;
        int lineNumber = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Игнат/Desktop/rer.txt"))) {

            File myFile = new File("C:/Users/Игнат/Desktop/rer.txt");
            FileReader fileReader = new FileReader(myFile);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);


            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }

            System.out.println(lineNumber);
            lineNumberReader.close();

        } catch (IOException exc) {
            System.out.println("exception" + ":" + exc);
        }

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введи СТОП чтоб закончить ввод строк: ");



        String str;

        try (FileWriter fw = new FileWriter("C:/Users/Игнат/Desktop/rer.txt")) {
            for (int i = 0; i < lineNumber ; i++) {

                str = b.readLine();
                if (str.compareTo("СТОП") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            }

        }catch (IOException e){
            System.out.println("EXCEPTION:  " + e);
        }
    }
}


    Итоговая задача №1:

    public class Task_final_1 {
        public static void main(String[] args) throws IOException {
            System.out.println("Введите с консоли число в бинарном формате:");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String bin = reader.readLine();

            int n = 0;
            for (int i = 0; i < bin.length(); i++) {
                n <<= 1;
                if (bin.charAt(i) == '1') n++;
            }
            System.out.println(n);
        }
    }


    финальное 2:

    public class Task_final_2 {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите длинну массива:");
            Integer[] length = new Integer[Integer.parseInt(reader.readLine())];

            System.out.println("Заполните массив:");
            for (int i = 0; i < length.length; i++) {
                length[i] = Integer.parseInt(reader.readLine());
            }

            int min, temp;

            for (int index = 0; index < length.length - 1; index++) {
                min = index;
                for (int scan = index + 1; scan < length.length; scan++) {
                    if (length[scan] < length[min])
                        min = scan;
                }

                temp = length[min];
                length[min] = length[index];
                length[index] = temp;

            }
            for (int i = 0; i < length.length; i++) {
                int s = length[i];
                System.out.println(s + " ");
            }
        }
    }


    Итоговая задача №3:

    public class Task_final_3{
        public static void main(String[] args) throws IOException {
            System.out.println("Введите длинну массива:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String D = reader.readLine();
            double x = Double.parseDouble(D);

            System.out.println("Заполните массив:");

            String R = reader.readLine();
            double y = Double.parseDouble(R);

            double sum = y / x;
            float f = (float) sum;
            System.out.format("%.2f", f);

        }
    }
