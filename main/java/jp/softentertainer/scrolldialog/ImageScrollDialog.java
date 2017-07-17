package jp.softentertainer.scrolldialog;

import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.Toast;

/**
 * Created by aokiyuuki on 2017/07/16.
 */

public class ImageScrollDialog extends ScrollDialog {

    public static ImageScrollDialog getInstance(String title, @DrawableRes int res) {
        ImageScrollDialog dialog = new ImageScrollDialog();
        dialog.setArguments(title, res);
        return dialog;
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(),"aaaa",Toast.LENGTH_LONG).show();
    }
}
