package com.example.demo8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

// 一共有运行状态、暂停 状态、停止状态和销毁状态这四种

public class LeftFragment extends Fragment {

    public static final String TAG = "LeftFragment";

    // 当碎片和活动建立关联的时候调用。
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttanch");
    }

    // 为碎片创建视图(加载布局)时调用
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.d(TAG,"onCreateView");

        View view = inflater.inflate(R.layout.left_fragment,container,false);

        return view;
    }

    // 确保与碎片相关联的活动一定已经创建完毕的时候调用
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG,"onPause");
        super.onPause();
    }

    // 当与碎片关联的视图被移除的时候调用
    @Override
    public void onDestroyView() {
        Log.d(TAG,"onDestroyView");
        super.onDestroyView();
    }

    //  当碎片和活动解除关联的时候调用
    @Override
    public void onDetach() {
        Log.d(TAG,"onDetach");
        super.onDetach();
    }

    public void updateFragmentFromActivity(String name){
        if (name.length() > 3) {
            Toast.makeText(getContext(),name,Toast.LENGTH_SHORT).show();
        }

        // fragment 中调用 activity 的方法
        MainActivity activity = (MainActivity) getActivity();
        activity.updateActivityFromFragment("update message from fragment");
    }

}
