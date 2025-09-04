public class work {
    static String[] ROUTE_X_NAMES = {
            "Oppox","Thamesley","Brinkley","Kiko","Endsley",
            "Kingsley","Allapay","Kronos","Longlines","Dovely"
    };
    static double[][] ROUTE_X_DISTANCES = {
            {0,0,0,0,0,0,0,0,0,0},
            {1.2,0,0,0,0,0,0,0,0,0},
            {2.2,1.0,0,0,0,0,0,0,0,0},
            {6.6,3.4,2.2,0,0,0,0,0,0,0},
            {5.7,4.5,3.5,1.3,0,0,0,0,0,0},
            {7.1,5.9,4.9,2.7,1.4,0,0,0,0,0},
            {8.0,6.8,5.8,3.6,2.3,0.9,0,0,0,0},
            {10.5,9.1,6.9,4.7,3.4,2.0,1.1,0,0,0},
            {10.5,9.3,8.1,5.9,4.6,3.2,2.3,1.2,0,0},
            {11.3,10.1,9.1,6.9,5.6,4.2,3.3,2.1,0.9,0}
    };
    static int[] ROUTE_X_TIMES = {0,5,6,6,8,4,7,5,6,6};

    public static void main(String[] args) {
        double distanceKikoLonglines = ROUTE_X_DISTANCES[8][3];
        System.out.println(distanceKikoLonglines);

        System.out.println(isValidDistances(ROUTE_X_DISTANCES));

        double d = getDistanceBetweenStations(ROUTE_X_NAMES, ROUTE_X_DISTANCES, "Kiko", "Longlines");
        if (d != -1)
            System.out.println(d);

        int totalTime = getTravelTimeBetweenStations(ROUTE_X_NAMES, ROUTE_X_TIMES, "Kiko", "Longlines");
        if (totalTime != -1)
            System.out.println(totalTime);
    }

    public static boolean isValidDistances(double[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i && arr[i][j] != 0) {
                    return false;
                }
                if (j < i && arr[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double getDistanceBetweenStations(String[] names, double[][] arr, String station1, String station2) {
        int index1 = -1, index2 = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(station1)) index1 = i;
            if (names[i].equalsIgnoreCase(station2)) index2 = i;
        }
        if (index1 == -1 || index2 == -1) {
            System.out.println("Station name not found");
            return -1;
        }
        return (index1 > index2) ? arr[index1][index2] : arr[index2][index1];
    }

    public static int getTravelTimeBetweenStations(String[] names, int[] times, String start, String end) {
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(start)) idx1 = i;
            if (names[i].equalsIgnoreCase(end)) idx2 = i;
        }
        if (idx1 == -1 || idx2 == -1) {
            System.out.println("Station not found");
            return -1;
        }
        int time = 0;
        if (idx1 < idx2) {
            for (int i = idx1 + 1; i <= idx2; i++) {
                time += times[i];
            }
        } else {
            for (int i = idx1; i > idx2; i--) {
                time += times[i];
            }
        }
        return time;
    }
}
