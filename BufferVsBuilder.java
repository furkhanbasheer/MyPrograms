public class BufferVsBuilder {
	public static void main (String [] args ) {
		int iterations = 1000000;

		long startTime = System.nanoTime();
		StringBuffer sbf = new StringBuffer("Hello");
		for(int i = 0; i<iterations; i++)
		{
			sbf.append("wolrd");
		}
		long endTime = System.nanoTime();
		long bufferTime = endTime - startTime;

		startTime = System.nanoTime();
		StringBuilder sbd = new StringBuilder("Hello");
		for(int i=0; i<iterations; i++)
		{
			sbd.append("World");

		}
		endTime = System.nanoTime();
		long builderTime =  endTime-startTime;
		System.out.println("Time Taken by String Buffer : " + bufferTime + " ns");
		System.out.println("Time Taken by String Builder : " + builderTime + " ns");
	}
}
