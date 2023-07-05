class ArrayDuplicat
{
public static void main(String[] args)
{
int a[]= {1,2,3,4,5,5};
 int i,d,j;
for(i=0;i<6;i++)
{
d=0;
 for(j=i+1;j<6;j++)
{
if(a[i]==a[j])
{
d++;
}
}
if(d==0)
{
System.out.println(a[i]);
}
}
}
}

  
