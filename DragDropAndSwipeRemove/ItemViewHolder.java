
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        if (itemView instanceof TextView) {
            textView = (TextView) itemView;
        }
    }
}
