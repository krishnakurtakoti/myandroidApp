import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;

import java.util.List;
//https://stackoverflow.com/questions/31964737/glide-image-loading-with-application-context/32887693#32887693 - for using glide
//https://android.jlelse.eu/using-glide-few-tips-to-be-a-pro-60f41e29d30a

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{
    private RequestManager glide;
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }


    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder,int i){
        //personViewHolder.personJob.setText(persons.get(i).job);
        // personViewHolder.jobLocation.setText(persons.get(i).location);
        // Glide.with(context).load(imageUrls.get(i).getImageUrl()).into(viewHolder.img);

        personViewHolder.holderNormTilte.setText(norms1.get(i).normTitle);
        personViewHolder.holderNormDescription.setText(norms1.get(i).normDescription);
        glide.load(norms1.get(i).url).into(personViewHolder.holderimageNorm);
        //loadImage(glide, norms.get(i), personViewHolder.holderimageNorm);
        //loadImage(glide, item.url, personViewHolder.holderimageNorm);
        //  glide.load(getModel(position).url).into(holder.iconImages);

        //Glide.with(this)


    }

    @Override
    public int getItemCount(){
        return norms1.size();
    }



    public static class PersonViewHolder extends RecyclerView.ViewHolder{
        // private RequestManager glide;
        CardView cv;
        TextView holderNormTilte;
        TextView holderNormDescription;
        ImageView holderimageNorm;

        PersonViewHolder(View itemView){
            //this.glide = glide;
            super(itemView);
            holderNormTilte = (TextView) itemView.findViewById(R.id.text_title);
            holderNormDescription = (TextView) itemView.findViewById(R.id.text_description);
            holderimageNorm =(ImageView) itemView.findViewById(R.id.image_Norm);
        }
    }


    List<Norms> norms1;
    RVAdapter(RequestManager glide,List<Norms> norms){
        norms1 = norms;
        this.glide = glide;
    }

}
