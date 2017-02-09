class Com
{
	public static void main(String a[])
	{
		String tmp;
		int n = a.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		System.out.printf("%s ",a[i]);
		System.out.printf("\n");
		for(i=1;i<n;i++)
		{
			temp = Integer.parseInt(a[i]);
			tmp = a[i];
			j = i-1;
			//printf("%d ",temp);
			while(temp<Integer.parseInt(a[j]))
			{
				a[j+1]=a[j];
				j--;
				if(j==-1)
				break;
			}
			a[j+1] = tmp;
		}
		System.out.printf("\n");
		for(i=0;i<n;i++)
		System.out.printf("%s ",a[i]);
	}
}