package id.amrilhs.githubuserpartone

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GithubUser(

    var login: String ="",
    var avatar:Int=0,
    var name: String="",
    var company: String="",
    var location: String="",
    var email: String="",
    var public_repos: Int=0,
    var follower: Int=0,
    var following: Int=0

): Parcelable
