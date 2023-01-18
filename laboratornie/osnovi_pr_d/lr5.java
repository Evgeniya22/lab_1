package osnovi_pr_d;

import java.util.*;

public class lr5 {
        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Введите количество пользовательских экранов: ");
            int qUI = user.nextInt();
            System.out.println("Введите количество обработчиков событий: ");
            int qAct = user.nextInt();
            System.out.println("Введите количество новых бизнес объектов: ");
            int qobjects = user.nextInt();
            System.out.println("Введите количество новых или модифицируемых бизнес методов: ");
            int qMeth = user.nextInt();
            double Eui = medianE(2, 4, 20);
            System.out.printf("\nСредняя трудоемкость кодирования пользовательского экрана равна %.2f чел.*час\n", Eui);
            double Eact = medianE(4, 8, 32);
            System.out.printf("Средняя трудоемкость кодирования одного обработчика событий равна %.2f чел.*час\n", Eact);
            double Ebo = medianE(2, 3, 8);
            System.out.printf("Средняя трудоемкость кодирования нового бизнес-объекта равна %.2f чел.*час\n", Ebo);
            double Ebm = medianE(2, 6, 26);
            System.out.printf("Средняя трудоемкость кодирования нового бизнес-метода равна %.2f чел.*час\n\n", Ebm);
            double Ci = CKO(2, 20);
            System.out.printf("Среднеквадратичное отклонение кодирования пользовательского экрана " +
                    "равна %.2f чел.*час\n", Ci);
            double Ct = CKO(4, 32);
            System.out.printf("Среднеквадратичное отклонение кодирования одного обработчика событий " +
                    "равна %.2f чел.*час\n", Ct);
            double Cb = CKO(2, 8);
            System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-объекта " +
                    "равна %.2f чел.*час\n", Cb);
            double CKObm = CKO(2,26);
            System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-метода " +
                    "равна %.2f чел.*час\n\n", CKObm);
            double Etl = Eui * qUI + Eact * qAct + Ebo * qobjects + Ebm * qMeth;
            System.out.printf("Суммарная трудоемкость проекта равна %.2f чел.*час\n\n", Etl);
            double tCKO = Math.sqrt(qUI * Math.pow(Ci, 2) + qAct * Math.pow(Ct, 2) +
                    qobjects * Math.pow(Cb, 2) + qMeth * Math.pow(CKObm, 2));
            System.out.printf("Среднеквадратичное отклонение суммарной трудоемкости кодирования проекта " +
                    "равно %.2f чел.*час\n", tCKO);
            double Etotal95 = Etl + 2 * tCKO;
            System.out.printf("Суммарная трудоемкость кодирования проекта с вероятность 95 процентов " +
                    "равна %.2f чел.*час\n", Etotal95);
            double relativeCKO = (tCKO / Etl) * 100;
            System.out.printf("Относительная погрешность в оценке суммарной трудоемкости кодирования " +
                    "равна %.2f чел.*час\n", relativeCKO);
            double wProject = 4 * Etotal95;
            System.out.printf("Общая трудоемкость проекта равна %.2f чел.*час\n", wProject);
            double manMonthTotalE = wProject / 132;
            System.out.printf("Общая трудоемкость проекта равна %.2f чел.*мес.\n", manMonthTotalE);
            double pLength = 2.5 * Math.pow(manMonthTotalE, 1./3);
            System.out.printf("Оптимальная продолжительность проекта равна %.1f месяцев\n", pLength);
            int crewQuantity = (int) Math.ceil(manMonthTotalE / pLength);
            System.out.printf("Средняя численность команды равна %d человек", crewQuantity);
        }

        public static double medianE(int minRequired, int mostProbable, int worstCase) {
            return (double) (worstCase + 4 * mostProbable + minRequired)/ 6;
        }

        public static double CKO(int minRequired, int worstCase) {
            return (double) (worstCase - minRequired) / 6;
        }
    }
