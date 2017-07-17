package jp.softentertainer.scrolldialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by aokiyuuki on 2017/07/16.
 */

public abstract class ScrollDialog extends android.support.v4.app.DialogFragment implements View.OnClickListener{

    private static final String KEY_TITLE = ScrollDialog.class + "TITLE";
    private static final String KEY_IMAGE = ScrollDialog.class + "IMAGE";

//    abstract public static ScrollDialog getInstance();
//    public static <T extends ScrollDialog> T getInstance(String title, @DrawableRes int res) {
//        T.class
//        ScrollDialog dialog = new T();
//        Bundle bundle = new Bundle();
//
//        // set paramater
//        bundle.putString(KEY_TITLE,title);
//        bundle.putInt(KEY_IMAGE,res);
//        dialog.setArguments(bundle);
//        return dialog;
//    }

    protected void setArguments(String title, @DrawableRes int res) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TITLE,title);
        bundle.putInt(KEY_IMAGE,res);
        this.setArguments(bundle);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstance){

        Dialog dialog = new Dialog(getActivity());

        Activity activyty = getActivity();

        Window window = dialog.getWindow();

        window.requestFeature(Window.FEATURE_NO_TITLE);

        Bundle bundle = getArguments();
        dialog.setContentView(R.layout.layout_dialog_scroll);

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);

        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView image =((ImageView) dialog.findViewById(R.id.scroll_dialog));
        image.setOnClickListener(this);
        //image.setBackground(ContextCompat.getDrawable(getContext(), bundle.getInt(KEY_IMAGE)));
        return dialog;
    }

}
