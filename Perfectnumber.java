class Perfectnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j,count=0,sum=0;
System.out.println("Enetr the n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<i;j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i)
System.out.println(i+" ");
sum=0;
}
}}