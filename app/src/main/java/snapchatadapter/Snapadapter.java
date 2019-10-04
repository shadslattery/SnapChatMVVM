package snapchatadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.SnapStory;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Snapadapter extends RecyclerView.Adapter<Snapadapter.SnapViewHolder> {

    private List<SnapStory> pictureList;

    public Snapadapter(List<SnapStory> pictureList) {
        this.pictureList = pictureList;
    }

    @NonNull
    @Override
    public SnapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.snap_story_item,
                parent,
                false);

        return new SnapViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Snapadapter.SnapViewHolder holder, int position) {
//        SnapStory snapStory = pictureList.get(position);

        // Pulls the URL's into the ImImage, which is the iv_image field
        SnapStory friends2 = pictureList.get(position);

        String path = friends2.getImageUrl();
        Picasso.get().load(path).into(holder.ImImage);

        // Pulls the UserName into the friendName3, which is the username field
        String friendName2 = friends2.getUserName();
        holder.tvUserName.setText(friendName2);

    }

    @Override
    public int getItemCount() {
        return pictureList.size();
    }

    class SnapViewHolder extends RecyclerView.ViewHolder {
        TextView tvUserName;
        ImageView ImImage;

        public SnapViewHolder(@NonNull View itemView) {

            super(itemView);
            tvUserName = itemView.findViewById(R.id.tv_name);
            ImImage = itemView.findViewById(R.id.iv_image);
        }
    }
}
