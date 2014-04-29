
public class DynamicH {
	public static int h(int n) {
		int[] table = new int[n+1];
		table[0] = 0;
		table[1] = 1;
		table[2] = 2;
		if (n % 2 == 0) {
			for (int i=3; i<=n; i++) {
				table[i] = table[i-3] + Math.min(table[i-2],table[i-1]);
			}
		}
		if (n % 2 == 1) {
			for (int i=3; i<=n; i++) {
				table[i] = table[i-3] + Math.max(table[i-2],table[i-1]); 
				}
		}
		return table[n];
	}
	public static void main(String[] args) {
		System.out.print(h(4));
		// do some testing here,
		// so that we can see that it works
	}
}
