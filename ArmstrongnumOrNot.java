class Armstrongnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j,count=0,sum=0,temp,temp1,product=1,rem;
System.out.println("Enetr the n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
temp=i;
for( ;temp>=0; )
{
temp=i/10;
count++;
}
temp1=i;
for( ;temp1>=0; )
{
rem=temp1%10;

while(count>0)
{
product=product*rem;
count--;
}
sum=sum+product;
temp1=temp1/10;
}
if(sum==i);
System.out.println(i+" ");
sum=0;
count=0;
}
}}
