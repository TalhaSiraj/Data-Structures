ArrayList<Integer> ar = new ArrayList<Integer>();
		int count =0;
		System.out.println("Enter Limit: ");
		int x = input.nextInt();
		for(int i = 0 ; i<x;i++)
		{
			System.out.println("Enter data : ");
			int data = input.nextInt();
			ar.add(data);
		}
		
		System.out.println("Available : "+ar);
		System.out.println("Choose : ");
		int check = input.nextInt();
		
		for(int loop = 0 ; loop<ar.size();loop++)
		{
			int ch = ar.get(loop);
			
			if(ch == check)
			{
				count++;
			}
		}
		System.out.println("Number of accurance is : "+count);