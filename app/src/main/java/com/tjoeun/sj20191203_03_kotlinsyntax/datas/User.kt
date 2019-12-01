package com.tjoeun.sj20191203_03_kotlinsyntax.datas

import java.io.Serializable

class User:Serializable{

    var name = ""
    var loginId =""

    override fun equals(other: Any?): Boolean {
        val otherUser = other as User
        return this.name == otherUser.name && this.loginId == otherUser.loginId
    }

}