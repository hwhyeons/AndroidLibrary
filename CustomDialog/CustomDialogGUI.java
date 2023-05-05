
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;


public class CustomDialogGUI extends Dialog {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND; // 바깥 배경 흐리게
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        setContentView(R.layout.add_new_work);
    }

    public CustomDialogGUI (Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }

    public void startCustomDialog(){
        this.setCancelable(true); // false로 설정하면 뒤로가기(onBackPressed) 작동 X
        this.getWindow().setGravity(Gravity.CENTER);
        this.show();
    }
}
