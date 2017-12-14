public class ArrayInverter {
    public static void invert(int[] data) {
	    for (int k = 0; k < data.length / 2; k++) {
		    int tmp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] - tmp;
		}
	}
}

// рекурсией
public class ArrayInverterRec {
    public static void invertRec(int[] data, int k) {
	    if (k < data.length / 2 - 1) {
		    int tmp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] - tmp;
			invertRec(data, k + 1);
		}
	}
}
