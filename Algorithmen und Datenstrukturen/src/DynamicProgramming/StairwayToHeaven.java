package DynamicProgramming;

public class StairwayToHeaven {
	
	private int stairwayToHeaven(int n) {
		int[] ways = new int[n+1];
		ways[0] = 1;
		ways[1] = 1;
		
		for (int i = 2; i < ways.length; i++) {
			ways[i] = ways[i-1] + ways[i-2];
		}
		
		return ways[n];
	}
	
	public static void main(String[] args) {
		StairwayToHeaven one = new StairwayToHeaven();		
				
		System.out.println(one.stairwayToHeaven(6));
	}

}
