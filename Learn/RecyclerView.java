public class popularrecommend_TransactionAdapter extends RecyclerView.Adapter<popularrecommend_TransactionAdapter.ViewHolder> {
        private List<newcampingtext_Transaction> trans;

        public class ViewHolder extends RecyclerView.ViewHolder {
            private final TextView dirtxvTopicBR;
            private final TextView dirtxvContentBR;
            private final TextView dirtxvHertBR;
            private final TextView dirtxvCommentBR;
            private final TextView dirtxvCollectBR;
            private final TextView dirtxvInfoShow;
            private final ImageView dirimgCampBR;
            private final ImageView dirimgHertBR;
            private final ImageView dirimgCommentBR;
            private final ImageView dirimgCollectBR;

            public ViewHolder(View itemView) {
                super(itemView);

                dirtxvTopicBR = (TextView) itemView.findViewById(R.id.txvTopicBR);
                dirtxvContentBR = (TextView) itemView.findViewById(R.id.txvContent);
                dirtxvHertBR = (TextView) itemView.findViewById(R.id.txvHertBR);
                dirtxvCommentBR = (TextView) itemView.findViewById(R.id.txvCommentBR);
                dirtxvCollectBR = (TextView) itemView.findViewById(R.id.txvCollectBR);
                dirtxvInfoShow = (TextView) itemView.findViewById(R.id.txvInfoShow);
                dirimgCampBR = (ImageView) itemView.findViewById(R.id.imgCampBR);
                dirimgHertBR = (ImageView) itemView.findViewById(R.id.imgHertBR);
                dirimgCommentBR = (ImageView) itemView.findViewById(R.id.imgCommentBR);
                dirimgCollectBR = (ImageView) itemView.findViewById(R.id.imgCollectBR);
            }

            /*
            public void setValues(newcampingtext_Transaction transaction){
                dirtxvTopicBR.setText(transaction.gettopicBR());
                dirtxvContentBR.setText(transaction.getcontentBR());
                dirtxvHertBR.setText(transaction.gethertBR());
                dirtxvCommentBR.setText(transaction.getcommentBR());
                dirtxvCollectBR.setText(transaction.getcollectBR());
                //dirimgCampBR.setImageURI(Uri.parse(transaction.getImageUrl()));
                gotphoto(dirimgCampBR, transaction.getImageUrl());
            }
            */
        }

        public popularrecommend_TransactionAdapter(List<newcampingtext_Transaction> trans) {
            this.trans = trans;
        }

        @Override
        public popularrecommend_TransactionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //Context context = parent.getContext();
            //View view = lf.from(context).inflate(R.layout.newcampingtext_row_trans, parent, false);
            //View view = lf.from(viewbasepage.getContext()).inflate(R.layout.newcampingtext_row_trans, parent, false);
            View view = lf.from(viewnewcampingtext.getContext()).inflate(R.layout.newcampingtext_row_trans, parent, false);
            popularrecommend_TransactionAdapter.ViewHolder viewHolder = new popularrecommend_TransactionAdapter.ViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final popularrecommend_TransactionAdapter.ViewHolder holder, final int position) {
            //RecyclerView.LayoutParams layoutParams;
            Log.d("TRANS", position + "");
            final newcampingtext_Transaction tran = trans.get(position);
            holder.dirtxvTopicBR.setText((tran.gettopicBR().length() > 25 ? tran.gettopicBR().substring(0, 24) + "...." : tran.gettopicBR()));
            holder.dirtxvContentBR.setText(tran.getcontentBR().substring(0, 10).replace('-', '/') + " " + viewCount.get(position) + "次瀏覽");
            holder.dirtxvHertBR.setText("推薦");
            holder.dirtxvCommentBR.setText("評論");
            holder.dirtxvCollectBR.setText("收藏");
            holder.dirtxvInfoShow.setText(tran.gethertBR() + "個推薦 " + tran.getcommentBR() + "篇評論 " + tran.getcollectBR() + "位加入收藏");

            //layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            //holder.dirimgIcon.setLayoutParams(layoutParams);
            //holder.dirimgCampBR.setScaleType(ImageView.ScaleType.FIT_CENTER);

            //holder.dirimgCampBR.setImageURI(Uri.parse(tran.getImageUrl()));
            //gotphoto(holder.dirimgCampBR, tran.getImageUrl());
            //holder.dirimgCampBR.setBackgroundResource(R.drawable.frame1);

            if (tran.getImageUrl().toString().equals("null")) {
                holder.dirimgCampBR.setImageResource(R.drawable.placeholderimage);
            } else {
                //Glide.with(MainActivity.this).load(tran.getImageUrl()).bitmapTransform(new RoundedCornersTransformation(MainActivity.this, 30, 0, RoundedCornersTransformation.CornerType.BOTTOM)).crossFade(1000).into(holder.dirimgCampBR);
                Glide.with(MainActivity.this).load(tran.getImageUrl()).bitmapTransform(new RoundedCornersTransformation(MainActivity.this, 20, 0, RoundedCornersTransformation.CornerType.ALL)).crossFade(1000).into(holder.dirimgCampBR);  //四周都是圆角
                //ctcontext = this;
            }

            //if (isPad(ctcontext)) {
            //    holder.dirimgCampBR.setPadding(19, 12, 36, 23);       //平板
            //} else {
            //    holder.dirimgCampBR.setPadding(30, 28, 58, 50);       //手機
            //}

            if (fbf == 0) {
            } else {
                for (int f = 0; f < arrecommends.length(); f++) {
                    try {
                        if (arrecommends.getInt(f) == tran.getBlogArticleId()) {
                            holder.dirimgHertBR.setImageResource(R.drawable.icon_over_heart_44);
                        } else {
                            holder.dirimgHertBR.setImageResource(R.drawable.icon_heart_44);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                for (int f = 0; f < arcomments.length(); f++) {
                    try {
                        if (arcomments.getInt(f) == tran.getBlogArticleId()) {
                            holder.dirimgCommentBR.setImageResource(R.drawable.icon_over_talk_44);
                        } else {
                            holder.dirimgCommentBR.setImageResource(R.drawable.icon_talk_44);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                for (int f = 0; f < arkeeps.length(); f++) {
                    try {
                        if (arkeeps.getInt(f) == tran.getBlogArticleId()) {
                            holder.dirimgCollectBR.setImageResource(R.drawable.icon_over_camera_44);
                        } else {
                            holder.dirimgCollectBR.setImageResource(R.drawable.icon_camera_44);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            holder.dirimgCampBR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String blogtitle = tran.getBlogerName();
                    String webaddress = tran.getBlogArticleURL();

                    Intent ivb = new Intent(getApplicationContext(), VisitBlogActivity.class);
                    Bundle bvb = new Bundle();

                    bvb.putString("blogtitle", blogtitle);
                    bvb.putString("webaddress", webaddress);

                    ivb.putExtras(bvb);
                    startActivityForResult(ivb, 0);
                }
            });

            holder.dirimgHertBR.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fbf == 0) {
                        Intent its = new Intent(MainActivity.this, FBLoginActivity.class);
                        startActivity(its);
                    } else {
                        SetRecommendKeepArticleJSON(tran.getBlogArticleId(), Member_ID, "", holder.dirimgHertBR, "Recommend");

                    }
                }
            });

            holder.dirimgCommentBR.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fbf == 0) {
                        Intent its = new Intent(MainActivity.this, FBLoginActivity.class);
                        startActivity(its);
                    } else {
                        //holder.dirimgCommentBR.setImageResource(R.drawable.icon_over_talk_44);
                        Intent isc = new Intent(getApplicationContext(), ShowCommentsActivity.class);
                        Bundle bsc = new Bundle();

                        bsc.putString("blogtitle", tran.getBlogerName());
                        bsc.putInt("Article_ID", tran.getBlogArticleId());
                        bsc.putInt("Member_ID", Member_ID);

                        isc.putExtras(bsc);
                        startActivityForResult(isc, 0);
                    }
                }
            });

            holder.dirimgCollectBR.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fbf == 0) {
                        Intent its = new Intent(MainActivity.this, FBLoginActivity.class);
                        startActivity(its);
                    } else {
                        SetRecommendKeepArticleJSON(tran.getBlogArticleId(), Member_ID, "", holder.dirimgCollectBR, "Keep");
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return trans == null ? 0 : trans.size();
        }
    }
