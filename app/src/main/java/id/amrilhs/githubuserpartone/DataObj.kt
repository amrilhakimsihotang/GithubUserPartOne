package id.amrilhs.githubuserpartone

object DataObj {
    private val login = arrayOf(
        "mojombo",
        "wycats",
        "ezmobius",
        "ivey",
        "evanphx",
        "vanpelt",
        "wayneeseguin",
        "amrilhakimsihotang",
        "kevinclark",
        "macournoyer",
        "takeo",
        "caged",
        "topfunky",
        "anotherjesse",
        "lukas"
    )

    private val avatar = intArrayOf(
        R.drawable.mojombo,
        R.drawable.wycats,
        R.drawable.ezmobius,
        R.drawable.ivey,
        R.drawable.evanphx,
        R.drawable.vanpelt,
        R.drawable.wayneeseguin,
        R.drawable.amrilhakimsihotang,
        R.drawable.kevinclark,
        R.drawable.macournoyer,
        R.drawable.takeo,
        R.drawable.caged,
        R.drawable.topfunky,
        R.drawable.anotherjesse,
        R.drawable.lukas
    )

    private val name = arrayOf(
        "Tom Preston-Werner",
        "Yehuda Katz",
        "Ezra Zygmuntowicz",
        "Michael D. Ivey",
        "Evan Phoenix",
        "Chris Van Pelt",
        "Wayne E. Seguin",
        "AHS, CCNA",
        "Kevin Clark",
        "Marc-André Cournoyer",
        "Toby Sterrett",
        "Justin Palmer",
        "Geoffrey Grosenbach",
        "Jesse Andrews",
        "Lukas Biewald"
    )

    private val company = arrayOf(
        "@chatterbugapp, @redwoodjs, @preston-werner-ventures",
        "@tildeio",
        "Stuffstr PBC",
        "@RiotGames",
        "@hashicorp",
        "crowdflower.com",
        "http://starkandwayne.com/",
        "Everywhere",
        "Cue",
        "@Shopify",
        "@zendesk",
        "ScaleRotate",
        "@hashicorp",
        "Planet Labs",
        "Weights and Biases"
    )

    private val location = arrayOf(
        "San Francisco",
        "Portland, OR",
        "In the NW",
        "Tuscumbia, AL",
        "Los Angeles, CA",
        "San Francisco",
        "Buffalo, NY",
        "Medan",
        "null",
        "Montreal, QC, Canada",
        "Portland, OR",
        "Places",
        "Seattle, USA",
        "San Francisco, CA",
        "San Francisco"
    )

    private val email = arrayOf(
        "tom@mojombo.com",
        "wycats@gmail.com",
        "null@null.com",
        "ivey@gweezlebur.com",
        "evan@phx.io",
        "vanpelt@wandb.com",
        "wayneeseguin@gmail.com",
        "gueamril@yahoo.com",
        "kevin.clark@gmail.com",
        "macournoyer@gmail.com",
        "tobysterrett@gmail.com",
        "encytemedia@gmail.com",
        "null@null.com",
        "anotherjesse@gmail.com",
        "lukas@wandb.com"
    )

    private val public_repos = intArrayOf(
        63, 250, 22, 88, 170, 57, 98, 40, 39, 60, 20, 159, 83, 129, 30
    )

    private val follower = intArrayOf(
        22880,
        9906,
        523,
        128,
        1440,
        161,
        717,
        3,
        97,
        1156,
        84,
        2257,
        1259,
        168,
        504
    )

    private val following = intArrayOf(
        11, 5, 13, 2, 7, 15, 17, 26, 6, 51, 11, 43, 231, 35, 19
    )

    val listData: ArrayList<GithubUser>
        get() {
            val list = ArrayList<GithubUser>()
            for (position in login.indices) {

                val githubUser = GithubUser()
                githubUser.avatar = avatar[position]
                githubUser.name = name[position]
                githubUser.company = company[position]
                githubUser.location = location[position]
                githubUser.email = email[position]
                githubUser.public_repos = public_repos[position]
                githubUser.follower = follower[position]
                githubUser.following = following[position]
                list.add(githubUser)
            }
            return list
        }


}