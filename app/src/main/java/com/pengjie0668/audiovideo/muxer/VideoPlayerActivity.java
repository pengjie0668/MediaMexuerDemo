package com.pengjie0668.audiovideo.muxer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.pengjie0668.audiovideo.R;

/**
 * 音视频混合界面
 */
public class VideoPlayerActivity extends AppCompatActivity {

    private static String mMP4Path;
    VideoView mVideoView;
    MediaController mMediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView pathTv = findViewById(R.id.path_tv);
        mVideoView = findViewById(R.id.video_view);
        mMediaController = new MediaController(this);
        mMP4Path = "/storage/emulated/0/android_records/video/test.mp4";
        if (!TextUtils.isEmpty(mMP4Path)) {
            mVideoView.setVideoPath(mMP4Path);
            mVideoView.setMediaController(mMediaController);
            mVideoView.seekTo(0);
            mVideoView.requestFocus();
            mVideoView.start();
            pathTv.setText(mMP4Path);
        }

    }

}