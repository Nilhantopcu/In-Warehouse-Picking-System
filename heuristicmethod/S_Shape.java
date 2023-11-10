/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heuristicmethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Nilhan Topcu
 */

public class S_Shape {
    public static void main(String[] args) throws FileNotFoundException {        
        
        
     File f = new File("C:\\JavaBTK\\HeuristicMethod\\src\\main\\java\\com\\mycompany\\heuristicmethod\\list.txt");
        
Scanner sc = new Scanner(f);
         
         int[] ais = new int[53];                   //file.size olacak. //koridor 
         int[] mod = new int[53];                     //modÃ¼l
         int[] blo = new int[53];
         
         int count=1;  
         
       while(sc.hasNext()){
        String v1 = sc.next(); 
        int c1 = Integer.parseInt(v1); //koridor
        String v2 = sc.next();
        int c2 = Integer.parseInt(v2); //modÃ¼l
                
        
        if(c2 >= 500){ //500lerdeyse
            blo[count]=1;
            if(c2%2==0){
              c2 = (c2%500)+2; //ve Ã§iftse 
            }
            else{
              c2 = c2%500;  //tekse
            }  
        }
        else if(c2>=1 &&c2<11){
            blo[count]=2;
            c2 = c2+14;
        }
        else if(c2<=20 && c2>10){
            blo[count]=3;
            c2 = c2+14;
        }
        
            ais[count]=c1; //koridor numaralarÃ„Â±nÃ„Â± array'e kaydettik
            mod[count]=c2; //module numaralarÃ„Â±nÃ„Â± array'e kaydettik      
             
 
            
        System.out.println(count+")"+" "+" Aisle: "+c1+" Module: "+c2+" Block: "+blo[count]); //file'dan her Ã…Å¸ey okundu mu onu kontrol ediyoruz
        count++;

    }
      
         System.out.println("This is the S-Shape distance: ");
   
         sMethod(ais,mod,blo);
        
    }
    
    public static void sMethod(int[] ais, int[] mod, int[] blo){
        double totalDistance = 0;
        //double distance = 0;
        
        double moduleLength = 2.4;
        double aisleLength = 1.2;  
        double crossAisle = 2.5;
        double distBetweenAisle = 1;
        
        
        for(int i=1; i<ais.length-1; i++){
            //for(int j=2; j<ais.length; j++){
            int j = i+1;    
            
                int from = mod[i];
                int to = mod[j];
                int isFromEven = from%2;
                int isToEven = to%2;
           
                int fromBlock = blo[i];
                int toBlock = blo[j];
                
                int firstAisleNo = ais[1];
                int lastAisleNo = ais[52];
                
                
                if(ais[i]==ais[j]){  
                    if(isFromEven==isToEven){  //ikisi Ã§ift ya da tekse 
                        if(fromBlock==toBlock){
                            int countModule = Math.abs((to-from)/2);
                            double distance = (countModule*moduleLength);
                            totalDistance = totalDistance+distance;
                            System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                            
                        }
                        else if(fromBlock!=toBlock){
                            int countBlock = Math.abs(toBlock-fromBlock);
                            int countModule = Math.abs((to-from)/2);
                            double distance = (countModule*moduleLength)+(countBlock*crossAisle);
                            totalDistance = totalDistance+distance;
                            System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                            
                        }
                        
                    }
                    else if(isFromEven!=isToEven){
                        if(fromBlock==toBlock){
                            if(isFromEven==0 && isToEven!=0){
                                int countModule = (Math.abs(to-(from-1))/2);
                                double distance = ((countModule*moduleLength)+aisleLength);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven==0){
                                int countModule = (Math.abs(to-(from+1))/2);
                                double distance = (countModule*moduleLength)+ aisleLength;
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                        }
                        else if(fromBlock!=toBlock){
                            if(isFromEven==0 && isToEven!=0){
                                int countBlock = Math.abs(toBlock-fromBlock);
                                int countModule = (Math.abs(to-(from-1))/2);
                                double distance = (countModule*moduleLength)+(countBlock*crossAisle)+ aisleLength;
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven==0){
                                int countBlock = Math.abs(toBlock-fromBlock);
                                int countModule =(Math.abs(to-(from+1))/2);
                                double distance = (countModule*moduleLength)+(countBlock*crossAisle) + aisleLength;
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                        }
                    }
                    
                    
                }
                else if(ais[i]!=ais[j]){ //farklÃ„Â± koridor
                    if((firstAisleNo%2)!=0){ //baÃ…Å¸langÃ„Â±ÃƒÂ§ koridoru tekse, tekler yukarÃ„Â± doÃ„Å¸ru
                        if((ais[i]%2)!=0){ //bulunduÃ„Å¸um koridor tekse
                            if(isFromEven==0 && isToEven==0){
                                int countModuleUp = Math.abs(34-from)/2;
                                int countModuleDown = Math.abs(34-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+aisleLength+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven==0 && isToEven!=0){
                                int countModuleUp = Math.abs(34-from)/2;
                                int countModuleDown = Math.abs(33-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven!=0){
                                int countModuleUp = Math.abs(33-from)/2;
                                int countModuleDown = Math.abs(33-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven==0){
                                int countModuleUp = Math.abs(33-from)/2;
                                int countModuleDown = Math.abs(34-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);  //Biz yaptÃ„Â±k (2*aisleLength)
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            
                        }
                        if((ais[i]%2)==0){//bulunduÃ„Å¸um koridor ÃƒÂ§iftse
                           if(isFromEven==0 && isToEven==0){
                                int countModuleUp = Math.abs((2-from)/2);
                                int countModuleDown = Math.abs((2-to)/2);
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+aisleLength+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                           else if(isFromEven==0 && isToEven!=0){
                                int countModuleUp = Math.abs(2-from)/2;
                                int countModuleDown = Math.abs(1-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);

                            }
                           else if(isFromEven!=0 && isToEven!=0){
                                int countModuleUp = Math.abs(1-from)/2;
                                int countModuleDown = Math.abs(1-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                           else if(isFromEven!=0 && isToEven==0){
                                int countModuleUp = Math.abs(1-from)/2;
                                int countModuleDown = Math.abs(2-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle); // biz yaptÃ„Â±k (2*aisleLength)
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }    
                    }
                       
                    
                }
                    if(firstAisleNo%2==0){ //baÃ…Å¸langÃ„Â±ÃƒÂ§ koridoru ÃƒÂ§iftse, ÃƒÂ§iftler yukarÃ„Â± doÃ„Å¸ru  //else yazÃ„Â±labilir !!!!
                        if((ais[i]%2)==0){ //bulunduÃ„Å¸um koridor ÃƒÂ§iftse
                            if(isFromEven==0 && isToEven==0){
                                int countModuleUp = Math.abs(34-from)/2;
                                int countModuleDown = Math.abs(34-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+aisleLength+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven==0 && isToEven!=0){
                                int countModuleUp = Math.abs(34-from)/2;
                                int countModuleDown = Math.abs(33-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven!=0){
                                int countModuleUp = Math.abs(33-from)/2;
                                int countModuleDown = Math.abs(33-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            else if(isFromEven!=0 && isToEven==0){
                                int countModuleUp = Math.abs(33-from)/2;
                                int countModuleDown = Math.abs(34-to)/2;
                                int countBlock = Math.abs(fromBlock-3);
                                int countBlock2 = Math.abs(toBlock-3);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle); // Biz yaptÃ„Â±k (2*aisleLength)
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                            
                        }
                        if((ais[i]%2)!=0){//bulunduÃ„Å¸um koridor tekse
                           if(isFromEven==0 && isToEven==0){
                                int countModuleUp = Math.abs((2-from)/2);
                                int countModuleDown = Math.abs((2-to)/2);
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+aisleLength+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                           else if(isFromEven==0 && isToEven!=0){
                                int countModuleUp = Math.abs(2-from)/2;
                                int countModuleDown = Math.abs(1-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);

                            }
                           else if(isFromEven!=0 && isToEven!=0){
                                int countModuleUp = Math.abs(1-from)/2;
                                int countModuleDown = Math.abs(1-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle);
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }
                           else if(isFromEven!=0 && isToEven==0){
                                int countModuleUp = Math.abs(1-from)/2;
                                int countModuleDown = Math.abs(2-to)/2;
                                int countBlock = Math.abs(fromBlock-1);
                                int countBlock2 = Math.abs(toBlock-1);
                                double distance = (countModuleUp*moduleLength)+(countBlock*crossAisle)+(2*aisleLength)+1+(countModuleDown*moduleLength)+(countBlock2*crossAisle); //Biz yaptÃ„Â±k (2*aisleLength)
                                totalDistance = totalDistance+distance;
                                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                                
                            }    
                    }
      
                }
                        
             }
       
        }
        
    }
    

}