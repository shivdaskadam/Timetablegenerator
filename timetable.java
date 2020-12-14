
package timetable2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Timetable2 {
    static int a2[]=new int[35];
    static  int a[]=new int[35];
    static int a1[]=new int[35];
    static int flag=0;
    
  static void INPUT()
    {
        flag=1;
   /*  try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
           
            String query="delete * from SE ";
            
            PreparedStatement prepStmt = con.prepareStatement(query);
            
           prepStmt.executeQuery();
           
             String query1 ="delete * from TE"; 
            
            PreparedStatement repStmt = con.prepareStatement(query1);
            
           repStmt.executeQuery();
           
             String quer2= "delete * from BE ";  
            
            PreparedStatement epStmt = con.prepareStatement(quer2);
            
           epStmt.executeQuery();
       
             con.close();
             
           
        }
       
    }catch(ClassNotFoundException | SQLException e){ System.out.println(e);}*/
      /////////////////////// SE INPUT ////////////////////////////  
        System.out.println("--------Enter Your Details-------- ");  
          Scanner in = new Scanner(System.in); 
          System.out.print("Enter the Number of subjects for SE:");    
          int iq = in.nextInt();
           int k=1;
             int m=101;
          for(int j=0;j<iq;j++)
          {
            
              System.out.println("Enter subject name:");
              Scanner a = new Scanner(System.in);
              String subname=a.next();
              
               System.out.println("Enter Teacher name:");
              
              String teachname=a.next();
              
               System.out.println("Enter Number of lectures per week:");
              
              int lecno=a.nextInt();
              
              System.out.println("Enter Subject status ('pr' for practical and 'th' for theory) ");
                String status=a.next();
              int an;
              int kk=m;
               try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            Statement stmt=con.createStatement(); 
            String query="select Teacher_id from SE where Teacher_name=?";
            
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1,teachname);
           ResultSet rs = prepStmt.executeQuery();
            while(rs.next())  
            {an =  rs.getInt(1);
                m=an;
                kk=kk-1;    
            }
           String sql1 ="insert into SE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql1)) {
            s.setInt(1,k);
            s.setString(2, subname);
            s.setInt(3,m);
            s.setString(4,teachname);
            s.setInt(5,lecno);
            s.setString(6,status);
            s.executeUpdate();
           
                    
            s.close();
        }
             con.close();
             
           
        }
       
    }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     m=kk;
      k=k + 1;
      m=m+1;          
    }  
      
      ///////////////////////////////// TE INPUT ////////////////////////////////////////
      
       Scanner aa = new Scanner(System.in);  
          System.out.print("Enter the Number of subjects for TE:");    
          int ab = aa.nextInt();
           int x=11;
             int y=111;
          for(int j=0;j<ab;j++)
          {
            
              System.out.println("Enter subject name:");
              Scanner a1 = new Scanner(System.in);
              String subname1=a1.next();
              
               System.out.println("Enter Teacher name:");
              
              String teachname1=a1.next();
              
               System.out.println("Enter Number of lectures per week:");
              
              int lecno1=a1.nextInt();
              
              System.out.println("Enter Subject status ('pr' for practical and 'th' for theory) ");
                String status1=a1.next();
              int ac;
              String teach="";
              int yy=y;
               try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            Statement stmt=con.createStatement(); 
            String query="select Teacher_id from SE where Teacher_name=?";
            
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1,teachname1);
           ResultSet rs = prepStmt.executeQuery();
            while(rs.next())  
            {ac =  rs.getInt(1);
                y=ac;
                    
            }
            
            
            String query1="select Teacher_id from TE where Teacher_name=?";
            int acc;
            PreparedStatement Stmt = con.prepareStatement(query1);
            Stmt.setString(1,teachname1);
           ResultSet rs1 = Stmt.executeQuery();
            while(rs1.next())  
            {acc =  rs1.getInt(1);
                y=acc;
                    
            }
           
           
           String sql1 ="insert into TE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql1)) {
            s.setInt(1,x);
            s.setString(2, subname1);
            s.setInt(3,y);
            s.setString(4,teachname1);
            s.setInt(5,lecno1);
            s.setString(6,status1);
            s.executeUpdate();
           
                    
            s.close();
        }
             con.close();
             
           
        }
       
    }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     y=yy;
      x=x + 1;
      y=y+1;          
    }  
      
      
   ////////////////////////////////// BE INPUT /////////////////////////////////////////   
      
       Scanner aa1 = new Scanner(System.in);  
          System.out.print("Enter the Number of subjects for BE:");    
          int ab1 = aa1.nextInt();
           int x1=21;
             int y1=121;
          for(int j=0;j<ab1;j++)
          {
            
              System.out.println("Enter subject name:");
              Scanner a2 = new Scanner(System.in);
              String subname2=a2.next();
              
               System.out.println("Enter Teacher name:");
              
              String teachname2=a2.next();
              
               System.out.println("Enter Number of lectures per week:");
              
              int lecno2=a2.nextInt();
              
              System.out.println("Enter Subject status ('pr' for practical and 'th' for theory) ");
                String status2=a2.next();
              int ac1;
              
              int yy1=y1;
               try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            
            String query="select Teacher_id from SE where Teacher_name=?";
            
            PreparedStatement prepStmt1 = con.prepareStatement(query);
            prepStmt1.setString(1,teachname2);
           ResultSet rs2 = prepStmt1.executeQuery();
            while(rs2.next())  
            {ac1 =  rs2.getInt(1);
                y1=ac1;
                    
            }
            
            
            String query1="select Teacher_id from TE where Teacher_name=?";
            
            PreparedStatement Stmt = con.prepareStatement(query1);
            Stmt.setString(1,teachname2);
           ResultSet rs3 = Stmt.executeQuery();
            while(rs3.next())  
            {ac1 =  rs3.getInt(1);
                y1=ac1;
                    
            }
           
             
            String query2="select Teacher_id from BE where Teacher_name=?";
            
            PreparedStatement Stmt1 = con.prepareStatement(query2);
            Stmt1.setString(1,teachname2);
           ResultSet rs4 = Stmt1.executeQuery();
            while(rs4.next())  
            {ac1 =  rs4.getInt(1);
                y1=ac1;
                    
            }
           
           String sql2 ="insert into BE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql2)) {
            s.setInt(1,x1);
            s.setString(2, subname2);
            s.setInt(3,y1);
            s.setString(4,teachname2);
            s.setInt(5,lecno2);
            s.setString(6,status2);
            s.executeUpdate();
           
                    
            s.close();
        }
             con.close();
             
           
        }
       
    }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     y1=yy1;
      x1=x1 + 1;
      y1=y1+1;          
    }
                 /////////////////////////////INSERT DEFAULT 0 FOR NO LECTURE/////////////////////////////////////////
    /*        try{  
    Class.forName("com.mysql.jdbc.Driver");  
          try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
           
           String sql1 ="insert into SE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql1)) {
            s.setInt(1,0);
            s.setString(2,"NO LECTURE");
            s.setInt(3,0);
            s.setString(4,"");
            s.setInt(5,0);
            s.setString(6,"");
            s.executeUpdate();
           
                    
            s.close();
        }
        String sql2 ="insert into TE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql2)) {
            s.setInt(1,0);
            s.setString(2,"NO LECTURE");
            s.setInt(3,0);
            s.setString(4,"");
            s.setInt(5,0);
            s.setString(6,"");
            s.executeUpdate();
           
                    
            s.close();
        }String sql3 ="insert into BE values(?,?,?,?,?,?)";
        try (PreparedStatement s = con.prepareStatement(sql3)) {
            s.setInt(1,0);
            s.setString(2,"NO LECTURE");
            s.setInt(3,0);
            s.setString(4,"");
            s.setInt(5,0);
            s.setString(6,"");
            s.executeUpdate();
           
                    
            s.close();
        }
             con.close();
             
           
        }
       
    }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
            */
    }


    
static void CREATE()
{
     
            Queue<Integer> q = new LinkedList<>(); 
          int mr3=0;
             try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            
            String query="select subject_id,No_of_lectures from SE";
            
            PreparedStatement pStmt1 = con.prepareStatement(query);
            
           ResultSet rs5 = pStmt1.executeQuery();
            while(rs5.next())  
            { 
                
                int a1 =  rs5.getInt(1);
                int a2= rs5.getInt(2);
                for(int ll=0;ll<a2;ll++)
                {
                    q.add(a1);
                }  
            }
             String queryj="select sum(No_of_lectures) from SE where status=?";
             ResultSet rpv1;
            try(PreparedStatement eprStmt2 = con.prepareStatement(queryj)){
             eprStmt2.setString(1,"th"); 
               rpv1 = eprStmt2.executeQuery();
            while(rpv1.next())  
            {
                 mr3 =  rpv1.getInt(1);   
            }}   
            
           }
 
}catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     int kk=q.size();        
     
     int i=0;
     for(int l=0;l<q.size();l++)
     {
       a[l]=0;  
       
     }
     while(!q.isEmpty())
     {
         if(a[i]==0)
         {
         int r=q.remove();
     try{       
    Class.forName("com.mysql.jdbc.Driver");  
        
       try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {  
            String abd="";
            
            String query="select status from SE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,r);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            abd=rs2.getString(1);}
           
           if(abd.equals("pr")&&mr3==0)
           {
               if(i>9&&i<15)
               {
                q.add(r);
               }
               else
               {
                a[i]=r;
                i=i+5;
                if(!q.isEmpty()){
                int w=q.remove();
                a[i]=w;
                i=i-4;}
                
               }
           }
           else
           {
             a[i]=r;
             i++;
             mr3--;
           }
 
       }}catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
         
         }
         
       
        
}
     
     //////////////////////////////TE///////////////////////////////
     
       Queue<Integer> q1 = new LinkedList<>(); 
        int mm3=0;
             try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            
            String query5="select subject_id,No_of_lectures from TE";
            
            PreparedStatement epStmt1 = con.prepareStatement(query5);
            
           ResultSet rp = epStmt1.executeQuery();
            while(rp.next())  
            { 
                
                int a1 =  rp.getInt(1);
                int a2= rp.getInt(2);
                for(int kl=0;kl<a2;kl++)
                {
                    q1.add(a1);
                }  
            }  
             String queryj="select sum(No_of_lectures) from TE where status=?";
             ResultSet rpv1;
            try(PreparedStatement eprStmt2 = con.prepareStatement(queryj)){
             eprStmt2.setString(1,"th"); 
               rpv1 = eprStmt2.executeQuery();
            while(rpv1.next())  
            {
                 mm3 =  rpv1.getInt(1);   
            }}   
           }
 
}catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     int kkk=q1.size();
    
     int h=0;
     for(int l=0;l<q.size();l++)
     {
       a1[l]=0;  
     }
     while(!q1.isEmpty())
     {
         
        if(a1[h]==0)
        {
         int r=q1.remove();
         int j=a[h];
         try{  
    Class.forName("com.mysql.jdbc.Driver");  
        //here sonoo is database name, root is username and password
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            int z=1;
            String query="select Teacher_id from SE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,j);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            z=rs2.getInt(1);
           }
           String query1="select Teacher_id from TE where subject_id=?";
            
            PreparedStatement mt2 = con.prepareStatement(query1);
             
            mt2.setInt(1,r);
            int l=1;
           ResultSet rs3 = mt2.executeQuery();
           while(rs3.next()){
            l=rs3.getInt(1);}
             
         if(l==z)
         {
             q1.add(r);
         }
         else
         { 
              try{       
    Class.forName("com.mysql.jdbc.Driver");  
        
       try (Connection con1 = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {  
            String abd="";
            
            String queryq="select status from TE where subject_id=?";
            
            PreparedStatement mtt1 = con1.prepareStatement(queryq);
             
            mtt1.setInt(1,r);
            
           ResultSet rss2 = mtt1.executeQuery();
           while(rss2.next()){
            abd=rss2.getString(1);}
           
           if(abd.equals("pr")&&mm3==0)
           {
               if(h>9&&h<15)
               {
                q1.add(r);
               }
               else{
            a1[h]=r;
            h=h+5;
            if(!q1.isEmpty()){
            q1.remove();}
            a1[h]=r;
            h=h-4;
               }
           }
           else
           {
             a1[h]=r;
             h++;
             mm3--;
           }
         }
         }
         
         catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
         
        }}
         
         } catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
       
         

    }else{h++;}
     
     }
    
     ///////////////////////////BE//////////////////////////////////
     
       Queue<Integer> q2 = new LinkedList<>(); 
int m3=0;
             try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            
            String query5="select subject_id,No_of_lectures from BE";
            
            PreparedStatement epStmt2 = con.prepareStatement(query5);
            
           ResultSet rp1 = epStmt2.executeQuery();
            while(rp1.next())  
            { 
                
                int a3 =  rp1.getInt(1);
                int a4= rp1.getInt(2);
                for(int kl=0;kl<a4;kl++)
                {
                    q2.add(a3);
                }  
            }  
            String queryj="select sum(No_of_lectures) from BE where status=?";
             ResultSet rpv1;
            try(PreparedStatement eprStmt2 = con.prepareStatement(queryj)){
             eprStmt2.setString(1,"pr"); 
               rpv1 = eprStmt2.executeQuery();
            while(rpv1.next())  
            {
                 m3 =  rpv1.getInt(1);   
            }}         
           }
 
}catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
     int bb=q2.size();
    
     for(int t=0;t<35;t++)
     {
         a2[t]=0;
     }
     int hh=0;
     while(!q2.isEmpty())
     {
         
        if(a2[hh]==0){
         int r=q2.remove();
         int j=a[hh];
         int c=a1[hh];
         try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            int z=1;
            String query="select Teacher_id from SE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,j);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            z=rs2.getInt(1);
           }
           String query1="select Teacher_id from TE where subject_id=?";
            
            PreparedStatement mt2 = con.prepareStatement(query1);
             
            mt2.setInt(1,c);
            int l=1;
           ResultSet rs3 = mt2.executeQuery();
           while(rs3.next()){
            l=rs3.getInt(1);}
           
           String query2="select Teacher_id from BE where subject_id=?";
            
            PreparedStatement mt3 = con.prepareStatement(query2);
             
            mt3.setInt(1,r);
            int p=1;
           ResultSet rb = mt3.executeQuery();
           while(rb.next()){
               
            p=rb.getInt(1);}
             
           
         if(p==z)
         {
             q2.add(r);
         }
         else if(p==l){
             q2.add(r);
         }
         else
         {
             try{       
    Class.forName("com.mysql.jdbc.Driver");  
        
       try (Connection con1 = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {  
            String abd="";
            
            String queryq="select status from BE where subject_id=?";
            
            PreparedStatement mtt1 = con1.prepareStatement(queryq);
             
            mtt1.setInt(1,r);
            
           ResultSet rss2 = mtt1.executeQuery();
           while(rss2.next()){
            abd=rss2.getString(1);}
           
           if(abd.equals("pr"))
           {
               if(hh>9&&hh<15)
               {
                q2.add(r);
               }
               else{
            a2[hh]=r;
            hh=hh+5;
            if(!q2.isEmpty()){
            q2.remove();}
            a2[hh]=r;
            hh=hh-4;
            m3=m3-2;
               }
           }
           else if(m3==0)
           {
             a2[hh]=r;
             hh++;
           }
           else
           {
               q2.add(r);
           }
         }
          }
         
         catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
        }}
         
         } catch(ClassNotFoundException | SQLException e){ System.out.println(e);} }
        else{hh++;}
        
       
     
      }
  

  System.out.println("TIMETABLE CREATED SUCCESSFULLY.....");
}
   static void SE()
    {
        if(flag==1){
     int f=1;
     
      System.out.println("");
     
      System.out.println("SECOND YEAR:\n");
      System.out.println("Lec.No.  MONDAY\t\t\tTUESDAY\t\t\tWEDNESDAY\t\tTHURSDAY\t\tFRIDAY");
      System.out.println("________________________________________________________________________________________________________________\n");
    System.out.print("1)\t");
      int fp=2;
      int ss=1;
     for(int t=0;t<35;t++){
         
             int a3=a[t];
                try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            String z="";
            String zz="";
            
            String query="select subject_name,Teacher_name from SE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,a3);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            z=rs2.getString(1);
            zz=rs2.getString(2);
           
           }
           
           if(ss%5==0)
           {
               
           System.out.print(z+"("+zz+")\t\t");
           System.out.println("\n");
            if(ss==15)
           {
               System.out.print("************************************************ R E C E S S **************************************************");
               System.out.println("\n");
           }
            if(fp<=7)
            System.out.print(fp+")\t");
            fp++;
           ss++;
           }
           else
           {
               System.out.print(z);
               System.out.print("("+zz+")\t\t");
               ss++;
           }
           
         }
        
                }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
    
     
     }
     System.out.print("________________________________________________________________________________________________________________\n");
        }
        else{
        System.out.println("TIMETABLE NOT CREATED YET !!!!");
        }
    }
    
    static void TE(){
    if(flag==1){
     System.out.println("\n\n\n");
     System.out.println("THIRD YEAR:\n");
     System.out.println("Lec.No.  MONDAY\t\t\tTUESDAY\t\t\tWEDNESDAY\t\tTHURSDAY\t\tFRIDAY");
    System.out.println("_______________________________________________________________________________________________________________\n");

     System.out.print("1)\t");
     int ftt=2;
     int st=1;
     for(int t=0;t<35;t++){
         int a3=a1[t];
                try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            String z="";
            String zz="";
            String query="select subject_name,Teacher_name from TE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,a3);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            z=rs2.getString(1);
            zz=rs2.getString(2);
           }
           
           if(st%5==0)
           {
           System.out.print(z+"("+zz+")\t\t");
           System.out.println("\n");
           if(st==15)
           {
               System.out.print("************************************************ R E C E S S **************************************************");
               System.out.println("\n");
           }
           if(ftt<=7)
            System.out.print(ftt+")\t");
            ftt++;
           st++;
           }
           else
           {
               System.out.print(z+"("+zz+")\t\t");
               st++;
           }
         }
        
                }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
    
     
     }
     System.out.println("_______________________________________________________________________________________________________________");

    }
    else{
        System.out.println("TIMETABLE NOT CREATED YET !!!!");
        }
    }
    
    static void BE()
    {
        if(flag==1){
      System.out.println("\n\n\n");
     System.out.println("FOURTH YEAR:\n");
     System.out.println("Lec.No.  MONDAY\t\t\tTUESDAY\t\t\tWEDNESDAY\t\tTHURSDAY\t\tFRIDAY");
     System.out.println("_______________________________________________________________________________________________________________\n");
    System.out.print("1)\t");
     int stt=1;
     int ft=2;
     for(int t=0;t<35;t++){
          int a3=a2[t];
                try{  
    Class.forName("com.mysql.jdbc.Driver");  
        
        try (Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Timetable?autoReconnect=true&useSSL=false","root","shivdas@123")) {
            
            String z="";
            String zz="";
            String query="select subject_name,Teacher_name from BE where subject_id=?";
            
            PreparedStatement mt1 = con.prepareStatement(query);
             
            mt1.setInt(1,a3);
            
           ResultSet rs2 = mt1.executeQuery();
           while(rs2.next()){
            z=rs2.getString(1);
            zz=rs2.getString(2);
           }
           
            if(stt%5==0)
           {
           System.out.print(z+"("+zz+")\t\t");
           System.out.println("\n");
            if(stt==15)
           {
               System.out.print("************************************************ R E C E S S **************************************************");
               System.out.println("\n");
           }
            if(ft<=7)
            System.out.print(ft+")\t");
            ft++;
           stt++;
           }
           else
           {
               System.out.print(z+"("+zz+")\t\t");
               stt++;
           }
         }
        
                }catch(ClassNotFoundException | SQLException e){ System.out.println(e);} 
    
     
     }
     System.out.println("_______________________________________________________________________________________________________________");

        }
        else{
        System.out.println("TIMETABLE NOT CREATED YET !!!!");
        }
    
      }

    

    public static void main(String[] args) {
        int n;
         do{
          System.out.println("****************************************MENU***********************************************");
          System.out.println("1) CREATE TIMETABLE \n2) DISPLAY SE TIMETABLE \n3) DISPLAY TE TIMETABLE \n4) DISPLAY BE TIMETABLE \n5) EXIT");
          System.out.println("ENTER YOUR CHOICE");
          Scanner av = new Scanner(System.in);
            n=av.nextInt();
           switch(n)
           {
               case 1:
                       INPUT();
                       CREATE();
                       break;
               
                case 2:
                       SE();
                       break;
               
                case 3:
                       TE();
                       break;
                       
                case 4:
                       BE();
                       break;
                       
                case 5:break;
                
                default:System.out.println("Wrong choice!!!!!!!");
           }
         }while(n!= 5);
          
          
    }}    
          

////////////////////////////////OUTPUT//////////////////////////////////////     
     
     
   
      
              
              
              
              



       
    
  
