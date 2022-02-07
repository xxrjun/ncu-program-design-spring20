import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class rollCallSysyem {
    public static void main(String[] args){
        //呼叫點名系統    
        rollCallFunction();

    }//end main
    
    //點名系統
    public static void rollCallFunction(){
        Random R = new Random();
        int r1 = 7 ,r2 = 0;//隨機碼
        int temp1 = 0 , temp2 = 0;//暫存隨機碼
        int Absentee = 0;//點到未到人數
        int temp_checkNum = 0;//檢查是否點過之變數
        int j = 0;
       
        int response = JOptionPane.showConfirmDialog(null,"*點名系統*\n面對講台右邊為第一排\n是否開始點名?","點名系統",JOptionPane.YES_NO_CANCEL_OPTION);
        // 0=yes, 1=no, 2=cancel
        
        while(response == 0){
            r1 = R.nextInt(7);
            temp1 = r1 +1;
            if(r1 >= 1 && r1 <=6){
                r2 = R.nextInt(9);
                temp2 = r2 +1;
                temp_checkNum = r1*10 +r2;
                if(Arrays.binarySearch(storageArrays, temp_checkNum) >= 0){
                   continue;
                }
                storageArrays[0] = temp_checkNum;
                Arrays.sort(storageArrays);
                

                int check = JOptionPane.showConfirmDialog(null,"你點到了 "+temp1+"_"+temp2+"(排_位)\n " + Students[r1][r2] + " \n是否有到?","點名系統",JOptionPane.YES_NO_CANCEL_OPTION); 
                if(check == 1){
                    JOptionPane.showConfirmDialog(null,temp1+"_"+temp2+"(排_位)\n " + Students[r1][r2] + " \n未到","未到名單紀錄",JOptionPane.DEFAULT_OPTION);
                    storageAbsentee[j] = Students[r1][r2];
                    j++;
                    Absentee++;
                }
                else if(check == 2){
                    JOptionPane.showMessageDialog(null,"感謝使用\n未到人數: "+ Absentee);
                    absenteePrint(storageAbsentee, Absentee);
                    break;
                }
            }
            else if(r1 == 1){
                r2 = R.nextInt(4);
                temp2 = r2 +1;
                temp_checkNum = r1*10 +r2;

                if(Arrays.binarySearch(storageArrays, temp_checkNum) >= 0){
                    continue;
                }
                storageArrays[0] = temp_checkNum;
                Arrays.sort(storageArrays);
                
                int check = JOptionPane.showConfirmDialog(null,"你點到了 "+temp1+"_"+temp2+"(排_位)\n " + Students[r1][r2] + " \n是否有到?","點名系統",JOptionPane.YES_NO_CANCEL_OPTION); 
                if(check == 1){
                    JOptionPane.showConfirmDialog(null,temp1+"_"+temp2+"(排_位)\n " + Students[r1][r2] + " \n未到","未到名單紀錄",JOptionPane.DEFAULT_OPTION);
                    storageAbsentee[j] = Students[r1][r2];
                    j++;
                    Absentee++;
                }
                else if(check == 2){
                    JOptionPane.showMessageDialog(null,"感謝使用\n未到人數: "+ Absentee);
                    absenteePrint(storageAbsentee, Absentee);
                    break;
                }
            }
            else if (r1 == 7){
                temp_checkNum = 87;
                storageArrays[0] = temp_checkNum;

                if(Arrays.binarySearch(storageArrays, temp_checkNum) >= 0){
                    continue;
                }
                storageArrays[0] = temp_checkNum;
                Arrays.sort(storageArrays);

                int check = JOptionPane.showConfirmDialog(null,"你點到了 8_7(排_位)\n " +Students[7][0] + " \n是否有到?","點名系統",JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == 1){
                    JOptionPane.showConfirmDialog(null,temp1+"_"+temp2+"(排_位)\n " + Students[r1][r2] + " \n未到","未到名單紀錄",JOptionPane.DEFAULT_OPTION);
                    storageAbsentee[j] = Students[r1][r2];
                    j++;
                    Absentee++;
                }
                else if(check == 2){
                    absenteePrint(storageAbsentee, Absentee);
                    break;
                }
            }
        }

        if(response == 1 || response ==2 ){
            JOptionPane.showMessageDialog(null,"感謝使用");
        }
    }
    
    //列印未到人數及未到人名
    public static void absenteePrint(String storageAbsentee[],int Absentee){
        List<String> list = new ArrayList<String>();

        for(String s : storageAbsentee) {
            if(s != null && s.length() > 0) {
                list.add(s);
            }
        }
        storageAbsentee = list.toArray(new String[list.size()]);
        JOptionPane.showMessageDialog(null,"感謝使用\n未到人數: "+ Absentee+"\n未到人: \n"+ Arrays.toString(storageAbsentee));
    }
    
    //儲存點過的編號
    public static int [] storageArrays = new int[65];

    //儲存未到的人
    public static String [] storageAbsentee = new String[65];

    //點名表學號以及姓名
    public static String [][]Students = {{"105602508 陳薇安",
        "107101018 劉恩慈" ,
        "107401030 胡皓翔",
        "107403043 王心屏",
        "108403028 張宏安"
        },//2
        {"108403201 黃名揚",
        "107403538 何瀅潔",
        "109403501 曾安汝",
        "109403024 楊凱翔",
        "108403202 林建佑",
        "109403523 陳貫翔",
        "109403502 楊珮綾",
        "109403022 劉宗翰",
        "109403029 廖章志",
        "109403504 何文瑄"
        },//3
        {"109403525 易靖程",
        "109403020 王廷傑",
        "109403519 鄭安哲",
        "109403016 黃啟宸",
        "109403017 郭宥磊",
        "108403204 蔡舒庭",
        "109403520 林恩立",
        "109403025 詹凱程",
        "108403054 張洲豪",
        "109403010 莊宜璇",
        },//4
        {"109403007 李姿慧",
        "109403512 徐  睿",
        "107408516 周歆晏",
        "109403503 潘  婷",
        "109403011 沈大鈞",
        "109403023 周峻祺",
        "109403517 蔡皓鈞",
        "109403509 吳毓珊",
        "109403027 潘敬中",
        "109403018 葉皇志"
        },//5
        {"109403521 顧明祐",
        "109403524 洪祥銘",
        "109403012 陳宥廷",
        "109403021 傅珩洵",
        "109403507 陳采姍",
        "108403517 廖紹洋",
        "109403019 鄒翔宇",
        "109403510 林愛庭",
        "109403002 周語宸",
        "109403506 郎文伶"
        },//6
        {"109403009 蘇湘婷",
        "109403515 李秉軒",
        "109403015 吳羿廷",
        "107403019 柯韋豪",
        "109403028 洪碧英",
        "109403511 黃彥哲",
        "108403001 陳莉媞",
        "109403526 黃彥程",
        "108202529 葉揚昀",
        "107403008 李明潔"
        },//7
        {"108401040 葉欣瑜",
        "109403006 潘心蕾",
        "109403001 呂采璇",
        "109403014 林伯瑾",
        "109403516 黃瑋宸",
        "109403508 張莉雯",
        "109403513 楊宸翔",
        "109403004 廖婕妤",
        "109403008 黎先芝",
        "109403518 簡宇杰"
        },//8
        {"108403025陳奕安"}
    };
}
