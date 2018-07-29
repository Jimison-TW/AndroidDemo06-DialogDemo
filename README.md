# AndroidDemo06-DialogDemo

![image](https://github.com/Jimison-TW/AndroidDemo06-DialogDemo/blob/master/Snap19.jpg?raw=true)

## 開發版本
Andorid 3.1.2 </br>
SdkVersion 24 </br>
minSdkVersion 15 </br>
targetSdkVersion 24 </br>

## 學習重點
1. 學習如何產生給予使用者提示的，對話視窗

## 如何實作Dialog
1. 透過`android.app.AlertDialog`這個物件，只要傳入Context，即可產生Dialog對話框
2. AlertDialog.Builder()有以下產生選項的方法
* setTitle：生成標題
* setMessage：生成對話框內容
* setCancelable：是否可以點擊畫面讓Dialog消失，如果沒有Button一定要加
* setPositiveButton：生成確認的按鈕，按鈕上的文字可以自行定義
* setNegativeButton：生成否定的按鈕，按鈕上的文字可以自行定義
* setNeutralButton：生成不確定的按鈕，按鈕上的文字可以自行定義
* show：當所有內容設定完後，需要用這個方法來顯示Dialog
3. 另外還有其他類型的Dialog像是`android.app.ProgressDialog`或`android.app.DatePickerDialog`
* ProgressDialog：產生一個下載中的Dialog
* DatePickerDialog：產生一個可以選擇日期的Dialog
