/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heuristicmethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Nilhan Topcu
 */
public class Return {
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
        int c2 = Integer.parseInt(v2); //modül
                
        
        if(c2 >= 500){ 
            blo[count]=1;
            if(c2%2==0){
              c2 = (c2%500)+2; 
            }
            else{
              c2 = c2%500;  
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
       
        
            ais[count]=c1; 
            mod[count]=c2;      
             
  
        System.out.println(count+")"+" "+" Aisle: "+c1+" Module: "+c2+" Block: "+blo[count]); 
        count++;

    }

         System.out.println("This is the distance with return: ");
         
         returnMethod(ais,mod,blo);
          
    }
    
     public static void returnMethod(int[] ais, int[] mod, int[] blo){
        
        double totalDistance = 0;
        
        double moduleLength = 2.4;
        double aisleLength = 1.2;  
        double crossAisle = 2.5;
        double distBetweenAisle = 1;
        int i=1;                         
        
        
        int[] aisNo = new int[200];
        for(int h=2;h<ais.length-1;h++){
            aisNo[1]=ais[1];
            if(ais[h]!=ais[h+1]){
                aisNo[h]=ais[h+1];
            }
        }
        
        int[] array1 = new int[34]; //her koridorda toplanacaklarÃ„Â± tespit etmek iÃƒÂ§in 24 array oluÃ…Å¸turuyoruz
        int[] array2 = new int[34];  int[] array3 = new int[34];
        int[] array4 = new int[34];  int[] array5 = new int[34];
        int[] array6 = new int[34];  int[] array7 = new int[34];
        int[] array8 = new int[34];  int[] array9 = new int[34];
        int[] array10 = new int[34]; int[] array11 = new int[34];
        int[] array12 = new int[34]; int[] array13 = new int[34];
        int[] array14 = new int[34]; int[] array15 = new int[34];
        int[] array16 = new int[34]; int[] array17 = new int[34];
        int[] array18 = new int[34]; int[] array19 = new int[34];
        int[] array20 = new int[34]; int[] array21 = new int[34];
        int[] array22 = new int[34]; int[] array23 = new int[34];
        int[] array24 = new int[34];
        int k = 1; int k2 = 1; int k3 = 1; int k4 = 1;
        int k5 = 1; int k6 = 1; int k7 = 1; int k8 = 1;
        int k9 = 1; int k10 = 1; int k11 = 1; int k12 = 1;
        int k13 = 1; int k14 = 1; int k15 = 1; int k16 = 1;
        int k17 = 1; int k18 = 1; int k19 = 1; int k20 = 1;
        int k21 = 1; int k22 = 1; int k23 = 1; int k24 = 1;
        
        
        for(int a=1; a<ais.length; a++){//burada aisle array'i uzunluÃ„Å¸u boyunca her koridor arrayine toplanacak ÃƒÂ¼rÃƒÂ¼nlerin modÃƒÂ¼llerini yazdÃ„Â±rÃ„Â±yoruz.
            if(ais[i]==1){
                array1[k]=mod[a];
                k++;
            }
            else if(ais[i]==2){
                array2[k2]=mod[a];
                k2++;
            }
            else if(ais[i]==3){
                array3[k3]=mod[a];
                k3++;
            }
            else if(ais[i]==4){
                array4[k4]=mod[a];
                k4++;
            }
            else if(ais[i]==5){
                array5[k5]=mod[a];
                k5++;
            }
            else if(ais[i]==6){
                array6[k6]=mod[a];
                k6++;
            }
            else if(ais[i]==7){
                array7[k7]=mod[a];
                k7++;
            }
            else if(ais[i]==8){
                array8[k8]=mod[a];
                k8++;
            }
            else if(ais[i]==9){
                array9[k9]=mod[a];
                k9++;
            }
            else if(ais[i]==10){
                array10[k10]=mod[a];
                k10++;
            }
            else if(ais[i]==11){
                array11[k11]=mod[a];
                k11++;
            }
            else if(ais[i]==12){
                array12[k12]=mod[a];
                k12++;
            }
            else if(ais[i]==13){
                array13[k13]=mod[a];
                k13++;
            }
            else if(ais[i]==14){
                array14[k14]=mod[a];
                k14++;
            }
            else if(ais[i]==15){
                array15[k15]=mod[a];
                k15++;
            }
            else if(ais[i]==16){
                array16[k16]=mod[a];
                k16++;
            }
            else if(ais[i]==17){
                array17[k17]=mod[a];
                k17++;
            }
            else if(ais[i]==18){
                array18[k18]=mod[a];
                k18++;
            }
            else if(ais[i]==19){
                array19[k19]=mod[a];
                k19++;
            }
            else if(ais[i]==20){
                array20[k20]=mod[a];
                k20++;
            }
            else if(ais[i]==21){
                array21[k21]=mod[a];
                k21++;
            }
            else if(ais[i]==22){
                array22[k22]=mod[a];
                k22++;
            }
            else if(ais[i]==23){
                array23[k23]=mod[a];
                k23++;
            }
            else if(ais[i]==24){
                array24[k24]=mod[a];
                k24++;
            }
            
            i++;
        }
        
        
        for(int n=1; n<aisNo.length; n++){ // hangi koridorda isek (baÃ…Å¸langÃ„Â±ÃƒÂ§ koridorundan bitiÃ…Å¸ koridoruna kadar) o koridorda mesafe hesabÃ„Â±
            if(aisNo[n]==1){
                int[] aEven1 = new int[17];      //ÃƒÂ§ift modÃƒÂ¼llerin array'i
                int[] aOdd1 = new int[17];      //tek modÃƒÂ¼llerin array'i
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array1.length;s++){ //bu iÃƒÂ§ iÃƒÂ§e for dÃƒÂ¶ngÃƒÂ¼sÃƒÂ¼ array'i sortlamak iÃƒÂ§in 
                   for(int t=s+1; t<array1.length;t++){
                       if(array1[s]>array1[t] && array1[t]!=0){
                           tempE = array1[s];
                           array1[s] = array1[t];
                           array1[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array1.length; f++){//burada sortlanmÃ„Â±Ã…Å¸ arraydeki ÃƒÂ§ift sayÃ„Â±larÃ„Â± ÃƒÂ§ift sayÃ„Â± array'ine alÃ„Â±yoruz
                    if(array1[f]%2==0 && array1[f]!=0){
                        aEven1[c1]=array1[f];
                        System.out.print(" | "+aEven1[c1]+" | ");                       
                        c1++;
                    }
                    else if(array1[f]%2!=0 && array1[f]!=0){//burada sortlanmÃ„Â±Ã…Å¸ arraydeki tek sayÃ„Â±larÃ„Â± tek sayÃ„Â± array'ine alÃ„Â±yoruz
                        aOdd1[c2]=array1[f];
                        System.out.print(" | "+aOdd1[c2]+" | ");  
                        c2++;
                    }
                }
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven1[c1-1]>=25){  // array son sefer de bir elemen artÃ„Â±rÃ„Â±lÃ„Â±yor ama artÃ„Â±rÃ„Â±lan yere eklicek ÃƒÂ¼rÃƒÂ¼n yok bu yÃƒÂ¼zden array boyutunu 1 azaltÃ„Â±yoruz 
                    countEvenBlock = 2;
                }
                else if(aEven1[c1-1]<25){
                    countEvenBlock = 1;
                }
                
                if(aOdd1[c2-1]>=25){
                    countOddBlock = 2;
                }
                else if(aOdd1[c2-1]<25){
                    countOddBlock = 1;
                }
                
                int howManyAisles=1;
                
                
                int moduleCountEven = Math.abs((aEven1[c1-1]-2)/2);// gezdiÃ„Å¸imiz modÃƒÂ¼l sayÃ„Â±sÃ„Â±nÃ„Â±n tespiti iÃƒÂ§in son ÃƒÂ§ift modÃƒÂ¼l-ilk yapÃ„Â±yoruz
                int countModuleOdd = Math.abs((aOdd1[c2-1]-1)/2);//mutlak deÃ„Å¸er iÃƒÂ§inde yapÃ„Â±yoruz ÃƒÂ§ÃƒÂ¼nkÃƒÂ¼ yukarÃ„Â±dan aÃ…Å¸aÃ„Å¸Ã„Â±ya iniyor da olabiliriz**
                
                
                double distance = ((Math.max(((aEven1[c1-1]-6)/2), ((aOdd1[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
 
            }
            else if(aisNo[n]==2){
                int[] aEven2 = new int[17];
                int[] aOdd2 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array2.length;s++){
                   for(int t=s+1; t<array2.length;t++){
                       if(array2[s]>array2[t] && array2[t]!=0){
                           tempE = array2[s];
                           array2[s] = array2[t];
                           array2[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: " +aisNo[n]);
                for(int f=1; f<array2.length; f++){
                    if(array2[f]%2==0 && array2[f]!=0){
                        aEven2[c1]=array2[f];
                        System.out.print(" | "+aEven2[c1]+" | ");
                        c1++;
                    }
                    else if(array2[f]%2!=0 && array2[f]!=0){
                        aOdd2[c2]=array2[f];
                        System.out.print(" | "+aOdd2[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven2[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven2[c1-1]<=24&aEven2[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven2[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd2[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd2[c2-1]<=23&aOdd2[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd2[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;
                

                
                distance = ((Math.max(((aEven2[c1-1]-6)/2), ((aOdd2[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            else if(aisNo[n]==3){
                int[] aEven3 = new int[17];
                int[] aOdd3 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array3.length;s++){
                   for(int t=s+1; t<array3.length;t++){
                       if(array3[s]>array3[t] && array3[t]!=0){
                           tempE = array3[s];
                           array3[s] = array3[t];
                           array3[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: " +aisNo[n]);
                for(int f=1; f<array3.length; f++){
                    if(array3[f]%2==0 && array3[f]!=0){
                        aEven3[c1]=array3[f];
                        System.out.print(" | "+aEven3[c1]+" | ");
                        c1++;
                    }
                    else if(array3[f]%2!=0 && array3[f]!=0){
                        aOdd3[c2]=array3[f];
                        System.out.print(" | "+aOdd3[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven3[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven3[c1-1]<=24&aEven3[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven3[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd3[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd3[c2-1]<=23&aOdd3[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd3[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;

                
                distance = ((Math.max(((aEven3[c1-1]-6)/2), ((aOdd3[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            
            else if(aisNo[n]==4){
                int[] aEven4 = new int[17];
                int[] aOdd4 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array4.length;s++){
                   for(int t=s+1; t<array4.length;t++){
                       if(array4[s]>array4[t] && array4[t]!=0){
                           tempE = array4[s];
                           array4[s] = array4[t];
                           array4[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array4.length; f++){
                    if(array4[f]%2==0 && array4[f]!=0){
                        aEven4[c1]=array4[f];
                        System.out.print(" | "+aEven4[c1]+" | ");
                        c1++;
                    }
                    else if(array4[f]%2!=0 && array4[f]!=0){
                        aOdd4[c2]=array4[f];
                        System.out.print(" | "+aOdd4[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven4[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven4[c1-1]<=24&aEven4[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven4[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd4[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd4[c2-1]<=23&aOdd4[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd4[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven4[c1-1]-6)/2), ((aOdd4[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==5){
                int[] aEven5 = new int[17];
                int[] aOdd5 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array5.length;s++){
                   for(int t=s+1; t<array5.length;t++){
                       if(array5[s]>array5[t] && array5[t]!=0){
                           tempE = array5[s];
                           array5[s] = array5[t];
                           array5[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: ");
                for(int f=1; f<array5.length; f++){
                    if(array5[f]%2==0 && array5[f]!=0){
                        aEven5[c1]=array5[f];
                        System.out.print(" | "+aEven5[c1]+" | ");
                        c1++;
                    }
                    else if(array5[f]%2!=0 && array5[f]!=0){
                        aOdd5[c2]=array5[f];
                        System.out.print(" | "+aOdd5[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven5[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven5[c1-1]<=24&aEven5[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven5[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd5[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd5[c2-1]<=23&aOdd5[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd5[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;

                
                distance = ((Math.max(((aEven5[c1-1]-6)/2), ((aOdd5[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==6){
                int[] aEven6 = new int[17];
                int[] aOdd6 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array6.length;s++){
                   for(int t=s+1; t<array6.length;t++){
                       if(array6[s]>array6[t] && array6[t]!=0){
                           tempE = array6[s];
                           array6[s] = array6[t];
                           array6[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array6.length; f++){
                    if(array6[f]%2==0 && array6[f]!=0){
                        aEven6[c1]=array6[f];
                        System.out.print(" | "+aEven6[c1]+" | ");
                        c1++;
                    }
                    else if(array6[f]%2!=0 && array6[f]!=0){
                        aOdd6[c2]=array6[f];
                        System.out.print(" | "+aOdd6[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven6[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven6[c1-1]<=24&aEven6[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven6[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd6[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd6[c2-1]<=23&aOdd6[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd6[c2-1]<=14){
                    countOddBlock = 0;
                }
              
                int howManyAisles=1;
                
               
                distance = ((Math.max(((aEven6[c1-1]-6)/2), ((aOdd6[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                            
        }
            else if(aisNo[n]==7){
                int[] aEven7 = new int[17];
                int[] aOdd7 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array7.length;s++){
                   for(int t=s+1; t<array7.length;t++){
                       if(array7[s]>array7[t] && array7[t]!=0){
                           tempE = array7[s];
                           array7[s] = array7[t];
                           array7[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array7.length; f++){
                    if(array7[f]%2==0 && array7[f]!=0){
                        aEven7[c1]=array7[f];
                        System.out.print(" | "+aEven7[c1]+" | ");
                        c1++;
                    }
                    else if(array7[f]%2!=0 && array7[f]!=0){
                        aOdd7[c2]=array7[f];
                        System.out.print(" | "+aOdd7[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven7[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven7[c1-1]<=24&aEven7[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven7[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd7[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd7[c2-1]<=23&aOdd7[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd7[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven7[c1-1]-6)/2), ((aOdd7[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==8){
                int[] aEven8 = new int[17];
                int[] aOdd8 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array8.length;s++){
                   for(int t=s+1; t<array8.length;t++){
                       if(array8[s]>array8[t] && array8[t]!=0){
                           tempE = array8[s];
                           array8[s] = array8[t];
                           array8[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array8.length; f++){
                    if(array8[f]%2==0 && array8[f]!=0){
                        aEven8[c1]=array8[f];
                        System.out.print(" | "+aEven8[c1]+" | ");
                        c1++;
                    }
                    else if(array8[f]%2!=0 && array8[f]!=0){
                        aOdd8[c2]=array8[f];
                        System.out.print(" | "+aOdd8[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven8[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven8[c1-1]<=24&aEven8[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven8[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd8[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd8[c2-1]<=23&aOdd8[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd8[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;
                              
                distance = ((Math.max(((aEven8[c1-1]-2)/2), ((aOdd8[c2-1]-1)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            else if(aisNo[n]==9){
                int[] aEven9 = new int[17];
                int[] aOdd9 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array9.length;s++){
                   for(int t=s+1; t<array9.length;t++){
                       if(array9[s]>array9[t] && array9[t]!=0){
                           tempE = array9[s];
                           array9[s] = array9[t];
                           array9[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array9.length; f++){
                    if(array9[f]%2==0 && array9[f]!=0){
                        aEven9[c1]=array9[f];
                        System.out.print(" | "+aEven9[c1]+" | ");
                        c1++;
                    }
                    else if(array9[f]%2!=0 && array9[f]!=0){
                        aOdd9[c2]=array9[f];
                        System.out.print(" | "+aOdd9[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven9[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven9[c1-1]<=24&aEven9[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven9[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd9[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd9[c2-1]<=23&aOdd9[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd9[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;

                
                distance = ((Math.max(((aEven9[c1-1]-2)/2), ((aOdd9[c2-1]-1)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            else if(aisNo[n]==10){
                int[] aEven10 = new int[17];
                int[] aOdd10 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array10.length;s++){
                   for(int t=s+1; t<array10.length;t++){
                       if(array10[s]>array10[t] && array10[t]!=0){
                           tempE = array10[s];
                           array10[s] = array10[t];
                           array10[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array10.length; f++){
                    if(array10[f]%2==0 && array10[f]!=0){
                        aEven10[c1]=array10[f];
                        System.out.print(" | "+aEven10[c1]+" | ");
                        c1++;
                    }
                    else if(array10[f]%2!=0 && array10[f]!=0){
                        aOdd10[c2]=array10[f];
                        System.out.print(" | "+aOdd10[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven10[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven10[c1-1]<=24&aEven10[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven10[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd10[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd10[c2-1]<=23&aOdd10[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd10[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven10[c1-1]-2)/2), ((aOdd10[c2-1]-1)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            
            else if(aisNo[n]==11){
                int[] aEven11 = new int[17];
                int[] aOdd11 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array11.length;s++){
                   for(int t=s+1; t<array11.length;t++){
                       if(array11[s]>array11[t] && array11[t]!=0){
                           tempE = array11[s];
                           array11[s] = array11[t];
                           array11[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array11.length; f++){
                    if(array11[f]%2==0 && array11[f]!=0){
                        aEven11[c1]=array11[f];
                        System.out.print(" | "+aEven11[c1]+" | ");
                        c1++;
                    }
                    else if(array11[f]%2!=0 && array11[f]!=0){
                        aOdd11[c2]=array11[f];
                        System.out.print(" | "+aOdd11[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven11[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven11[c1-1]<=24&aEven11[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven11[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd11[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd11[c2-1]<=23&aOdd11[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd11[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven11[c1-1]-2)/2), ((aOdd11[c2-1]-1)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            else if(aisNo[n]==12){
                int[] aEven12 = new int[17];
                int[] aOdd12 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array12.length;s++){
                   for(int t=s+1; t<array12.length;t++){
                       if(array12[s]>array12[t] && array12[t]!=0){
                           tempE = array12[s];
                           array12[s] = array12[t];
                           array12[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array12.length; f++){
                    if(array12[f]%2==0 && array12[f]!=0){
                        aEven12[c1]=array12[f];
                        System.out.print(" | "+aEven12[c1]+" | ");
                        c1++;
                    }
                    else if(array12[f]%2!=0 && array12[f]!=0){
                        aOdd12[c2]=array12[f];
                        System.out.print(" | "+aOdd12[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven12[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven12[c1-1]<=24&aEven12[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven12[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd12[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd12[c2-1]<=23&aOdd12[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd12[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

               
                distance = ((Math.max(((aEven12[c1-1]-6)/2), ((aOdd12[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
                
            }
            else if(aisNo[n]==13){
                int[] aEven13 = new int[17];
                int[] aOdd13 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array13.length;s++){
                   for(int t=s+1; t<array13.length;t++){
                       if(array13[s]>array13[t] && array13[t]!=0){
                           tempE = array13[s];
                           array13[s] = array13[t];
                           array13[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array13.length; f++){
                    if(array13[f]%2==0 && array13[f]!=0){
                        aEven13[c1]=array13[f];
                        System.out.print(" | "+aEven13[c1]+" | ");
                        c1++;
                    }
                    else if(array13[f]%2!=0 && array13[f]!=0){
                        aOdd13[c2]=array13[f];
                        System.out.print(" | "+aOdd13[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven13[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven13[c1-1]<=24&aEven13[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven13[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd13[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd13[c2-1]<=23&aOdd13[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd13[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;

                
                distance = ((Math.max(((aEven13[c1-1]-6)/2), ((aOdd13[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
                            
            }
            else if(aisNo[n]==14){
                int[] aEven14 = new int[17];
                int[] aOdd14 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array14.length;s++){
                   for(int t=s+1; t<array14.length;t++){
                       if(array14[s]>array14[t] && array14[t]!=0){
                           tempE = array14[s];
                           array14[s] = array14[t];
                           array14[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array14.length; f++){
                    if(array14[f]%2==0 && array14[f]!=0){
                        aEven14[c1]=array14[f];
                        System.out.print(" | "+aEven14[c1]+" | ");
                        c1++;
                    }
                    else if(array14[f]%2!=0 && array14[f]!=0){
                        aOdd14[c2]=array14[f];
                        System.out.print(" | "+aOdd14[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven14[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven14[c1-1]<=24&aEven14[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven14[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd14[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd14[c2-1]<=23&aOdd14[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd14[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                
                int howManyAisles=1;              

                
                distance = ((Math.max(((aEven14[c1-1]-6)/2), ((aOdd14[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            
            else if(aisNo[n]==15){
                int[] aEven15 = new int[17];
                int[] aOdd15 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array15.length;s++){
                   for(int t=s+1; t<array15.length;t++){
                       if(array15[s]>array15[t] && array15[t]!=0){
                           tempE = array15[s];
                           array15[s] = array15[t];
                           array15[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array15.length; f++){
                    if(array15[f]%2==0 && array15[f]!=0){
                        aEven15[c1]=array15[f];
                        System.out.print(" | "+aEven15[c1]+" | ");
                        c1++;
                    }
                    else if(array15[f]%2!=0 && array15[f]!=0){
                        aOdd15[c2]=array15[f];
                        System.out.print(" | "+aOdd15[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven15[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven15[c1-1]<=24&aEven15[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven15[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd15[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd15[c2-1]<=23&aOdd15[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd15[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;               

                
                distance = ((Math.max(((aEven15[c1-1]-6)/2), ((aOdd15[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            
            else if(aisNo[n]==16){
                int[] aEven16 = new int[17];
                int[] aOdd16 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array16.length;s++){
                   for(int t=s+1; t<array16.length;t++){
                       if(array16[s]>array16[t] && array16[t]!=0){
                           tempE = array16[s];
                           array16[s] = array16[t];
                           array16[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array16.length; f++){
                    if(array16[f]%2==0 && array16[f]!=0){
                        aEven16[c1]=array16[f];
                        System.out.print(" | "+aEven16[c1]+" | ");
                        c1++;
                    }
                    else if(array16[f]%2!=0 && array16[f]!=0){
                        aOdd16[c2]=array16[f];
                        System.out.print(" | "+aOdd16[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven16[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven16[c1-1]<=24&aEven16[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven16[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd16[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd16[c2-1]<=23&aOdd16[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd16[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven16[c1-1]-6)/2), ((aOdd16[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==17){
                int[] aEven17 = new int[17];
                int[] aOdd17 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array17.length;s++){
                   for(int t=s+1; t<array17.length;t++){
                       if(array17[s]>array17[t] && array17[t]!=0){
                           tempE = array17[s];
                           array17[s] = array17[t];
                           array17[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array17.length; f++){
                    if(array17[f]%2==0 && array17[f]!=0){
                        aEven17[c1]=array17[f];
                        System.out.print(" | "+aEven17[c1]+" | ");
                        c1++;
                    }
                    else if(array17[f]%2!=0 && array17[f]!=0){
                        aOdd17[c2]=array17[f];
                        System.out.print(" | "+aOdd17[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven17[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven17[c1-1]<=24&aEven17[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven17[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd17[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd17[c2-1]<=23&aOdd17[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd17[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven17[c1-1]-6)/2), ((aOdd17[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==18){
                int[] aEven18 = new int[17];
                int[] aOdd18 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array18.length;s++){
                   for(int t=s+1; t<array18.length;t++){
                       if(array18[s]>array18[t] && array18[t]!=0){
                           tempE = array18[s];
                           array18[s] = array18[t];
                           array18[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array18.length; f++){
                    if(array18[f]%2==0 && array18[f]!=0){
                        aEven18[c1]=array18[f];
                        System.out.print(" | "+aEven18[c1]+" | ");
                        c1++;
                    }
                    else if(array18[f]%2!=0 && array18[f]!=0){
                        aOdd18[c2]=array18[f];
                        System.out.print(" | "+aOdd18[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven18[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven18[c1-1]<=24&aEven18[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven18[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd18[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd18[c2-1]<=23&aOdd18[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd18[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven18[c1-1]-6)/2), ((aOdd18[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==19){
                int[] aEven19 = new int[17];
                int[] aOdd19 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array19.length;s++){
                   for(int t=s+1; t<array19.length;t++){
                       if(array19[s]>array19[t] && array19[t]!=0){
                           tempE = array19[s];
                           array19[s] = array19[t];
                           array19[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array19.length; f++){
                    if(array19[f]%2==0 && array19[f]!=0){
                        aEven19[c1]=array19[f];
                        System.out.print(" | "+aEven19[c1]+" | ");
                        c1++;
                    }
                    else if(array19[f]%2!=0 && array19[f]!=0){
                        aOdd19[c2]=array19[f];
                        System.out.print(" | "+aOdd19[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven19[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven19[c1-1]<=24&aEven19[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven19[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd19[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd19[c2-1]<=23&aOdd19[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd19[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;               

                
                distance = ((Math.max(((aEven19[c1-1]-6)/2), ((aOdd19[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==20){
                int[] aEven20 = new int[17];
                int[] aOdd20 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array20.length;s++){
                   for(int t=s+1; t<array20.length;t++){
                       if(array20[s]>array20[t] && array20[t]!=0){
                           tempE = array20[s];
                           array20[s] = array20[t];
                           array20[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array20.length; f++){
                    if(array20[f]%2==0 && array20[f]!=0){
                        aEven20[c1]=array20[f];
                        System.out.print(" | "+aEven20[c1]+" | ");
                        c1++;
                    }
                    else if(array20[f]%2!=0 && array20[f]!=0){
                        aOdd20[c2]=array20[f];
                        System.out.print(" | "+aOdd20[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven20[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven20[c1-1]<=24&aEven20[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven20[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd20[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd20[c2-1]<=23&aOdd20[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd20[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;
                
                distance = ((Math.max(((aEven20[c1-1]-6)/2), ((aOdd20[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==21){
                int[] aEven21 = new int[17];
                int[] aOdd21 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array21.length;s++){
                   for(int t=s+1; t<array21.length;t++){
                       if(array21[s]>array21[t] && array21[t]!=0){
                           tempE = array21[s];
                           array21[s] = array21[t];
                           array21[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array21.length; f++){
                    if(array21[f]%2==0 && array21[f]!=0){
                        aEven21[c1]=array21[f];
                        System.out.print(" | "+aEven21[c1]+" | ");
                        c1++;
                    }
                    else if(array21[f]%2!=0 && array21[f]!=0){
                        aOdd21[c2]=array21[f];
                        System.out.print(" | "+aOdd21[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven21[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven21[c1-1]<=24&aEven21[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven21[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd21[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd21[c2-1]<=23&aOdd21[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd21[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven21[c1-1]-6)/2), ((aOdd21[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==22){
                int[] aEven22 = new int[17];
                int[] aOdd22 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array22.length;s++){
                   for(int t=s+1; t<array22.length;t++){
                       if(array22[s]>array22[t] && array22[t]!=0){
                           tempE = array22[s];
                           array22[s] = array22[t];
                           array22[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array22.length; f++){
                    if(array22[f]%2==0 && array22[f]!=0){
                        aEven22[c1]=array22[f];
                        System.out.print(" | "+aEven22[c1]+" | ");
                        c1++;
                    }
                    else if(array22[f]%2!=0 && array22[f]!=0){
                        aOdd22[c2]=array22[f];
                        System.out.print(" | "+aOdd22[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven22[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven22[c1-1]<=24&aEven22[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven22[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd22[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd22[c2-1]<=23&aOdd22[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd22[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;                

                
                distance = ((Math.max(((aEven22[c1-1]-6)/2), ((aOdd22[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==23){
                int[] aEven23 = new int[17];
                int[] aOdd23 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array23.length;s++){
                   for(int t=s+1; t<array23.length;t++){
                       if(array23[s]>array23[t] && array23[t]!=0){
                           tempE = array23[s];
                           array23[s] = array23[t];
                           array23[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array23.length; f++){
                    if(array23[f]%2==0 && array23[f]!=0){
                        aEven23[c1]=array23[f];
                        System.out.print(" | "+aEven23[c1]+" | ");
                        c1++;
                    }
                    else if(array23[f]%2!=0 && array23[f]!=0){
                        aOdd23[c2]=array23[f];
                        System.out.print(" | "+aOdd23[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven23[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven23[c1-1]<=24&aEven23[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven23[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd23[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd23[c2-1]<=23&aOdd23[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd23[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;
                
                distance = ((Math.max(((aEven23[c1-1]-6)/2), ((aOdd23[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
            
            else if(aisNo[n]==24){
                int[] aEven24 = new int[17];
                int[] aOdd24 = new int[17];
                
                int tempE = 0;
                int c1 = 1;
                int c2 = 1;
                
                for(int s=1; s<array24.length;s++){
                   for(int t=s+1; t<array24.length;t++){
                       if(array24[s]>array24[t] && array24[t]!=0){
                           tempE = array24[s];
                           array24[s] = array24[t];
                           array24[t] = tempE;        
                       }
                   }
                }
                
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                for(int f=1; f<array24.length; f++){
                    if(array24[f]%2==0 && array24[f]!=0){
                        aEven24[c1]=array24[f];
                        System.out.print(" | "+aEven24[c1]+" | ");
                        c1++;
                    }
                    else if(array24[f]%2!=0 && array24[f]!=0){
                        aOdd24[c2]=array24[f];
                        System.out.print(" | "+aOdd24[c2]+" | ");
                        c2++;
                    }
                }
                
                double distance =0;
                
                int countOddBlock = 0;
                int countEvenBlock = 0;
                
                if(aEven24[c1-1]>24){
                    countEvenBlock = 2;
                }
                else if(aEven24[c1-1]<=24&aEven24[c1-1]>14){
                    countEvenBlock = 1;
                }
                else if(aEven24[c1-1]<=14){
                    countEvenBlock = 0;
                }
                
                if(aOdd24[c2-1]>23){
                    countOddBlock = 2;
                }
                else if(aOdd24[c2-1]<=23&aOdd24[c2-1]>14){
                    countOddBlock = 1;
                }
                else if(aOdd24[c2-1]<=14){
                    countOddBlock = 0;
                }
                
                int howManyAisles=1;               

                
                distance = ((Math.max(((aEven24[c1-1]-6)/2), ((aOdd24[c2-1]-5)/2)))*moduleLength*2)+(Math.max(countEvenBlock*2,countOddBlock*2)*crossAisle)+(howManyAisles*aisleLength)+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
            }
        }
            
            
            System.out.println("The total distance is: "+totalDistance);
            
            
        }
    
}
