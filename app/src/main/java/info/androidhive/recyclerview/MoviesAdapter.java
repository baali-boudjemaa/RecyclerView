package info.androidhive.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;
    Context context;
    //private List<Grocery> horizontalGrocderyList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public ImageView imageView;
        Button like;

        public MyViewHolder(View view) {
            super(view);

            imageView=view.findViewById(R.id.imageView);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            like=(Button)view.findViewById(R.id.like1);
            like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    like.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.bgch));
                }
            });

        }
    }


    public MoviesAdapter(List<Movie> moviesList,Context context) {

        this.context = context;
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        Movie movie = moviesList.get(position);
        holder.imageView.setImageResource(moviesList.get(position).getImgid());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = moviesList.get(position).getImgid();
                Toast.makeText(context, id + " is selected", Toast.LENGTH_SHORT).show();
            }
        });

        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
