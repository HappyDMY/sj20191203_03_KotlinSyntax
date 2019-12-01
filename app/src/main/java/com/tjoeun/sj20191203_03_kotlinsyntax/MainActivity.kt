package com.tjoeun.sj20191203_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr  = ArrayList<Int>()

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(0,15)
        lottoNumArr.add(17)

        Log.d("로또넘버 입력한 개수", "${lottoNumArr.size} 개 입력됨")
        Log.d("로또넘버 목록", "${lottoNumArr.toString()}")
        Log.d("42의 인덱스", "${lottoNumArr.indexOf(42)}")
        Log.d("1번칸에는 뭐가 있을까용???", "${lottoNumArr.get(1)}")
        //42를 뺴고 싶을때
        lottoNumArr.remove(42)
        //45를 뺴고 싶을때
        lottoNumArr.remove(45)//아무 일도 발생 안함 return 값이 Boolean

        //맨 앞의 자료를 지우고 싶을때
        lottoNumArr.removeAt(0)



    }
}
