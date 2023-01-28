package com.asif.navigationcomponent.homepage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.asif.navigationcomponent.R
import com.asif.navigationcomponent.databinding.FragmentHomepageBinding


class HomepageFragment : Fragment(R.layout.fragment_homepage) {
    private lateinit var binding: FragmentHomepageBinding
    var listCategory = mutableListOf<Qservicedataclass>()
    val args:HomepageFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomepageBinding.bind(view)
        val username=args.username
        val password = args.userpassword
        binding.userNameTxt.text = username
        binding.userPassTxt.text = password



        listCategory.add(Qservicedataclass("Asif","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/312568940_3230201747230007_8369135975538212220_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeE1rg1VyEAM6RLjSDHn8lggUvDuV39rGm5S8O5Xf2sabmkE8l5YbgcclyefLA844sWkozfMhtCXHW1bG1Yay8q_&_nc_ohc=Hf_vlMFLDTMAX8P75Kp&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDM2pUv0CRC3i0bHisnVUwSkDiY9tyhR04qd3d45p5N9Q&oe=63D8A86D"))
        listCategory.add(Qservicedataclass("Nahin","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273497723_3032348303672667_7408001268607770204_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeH46Rjz0O0cc_lGiAZPTMcfFTFG9noVeMIVMUb2ehV4whvVDO0JYldteB2P0AffgB7UwypOUGpFmmgrOJL-B6H0&_nc_ohc=iechLSpJiSYAX-leT1r&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDEVtP_AVetqQQ24DSDOY_2AubEYDAixEtfdNo9Tsc95A&oe=63DA479E"))
        listCategory.add(Qservicedataclass("Hemi","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273722099_1666879373657438_2557287155176625846_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEQWVI02c2tte8ExQdn18QIhkzuMd5-X6uGTO4x3n5fq7LqF8DlqE522mWtftQdScDyg5shaUxe4oSyObE86Ky1&_nc_ohc=0FQl1FlayoUAX_ZudEg&tn=YnVnIqmCkg8_2YG9&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDVypMYZJ63IRLJu9BY3nXujksdDoSpCe431CZxPTRQFQ&oe=63DA92CB"))
        listCategory.add(Qservicedataclass("Samera","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/307187810_3194254780834453_5733062472254682968_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeFtwx7f2LpEzd0CLj2Imous5RGUovHPeYrlEZSi8c95ijbxQytGQVOqxUACaYlyc9u4e3UBfNeCnNSGzSY8b1M3&_nc_ohc=0zAJx03BSKAAX_tmjtz&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDxZbOLNS_p6dfIu82849V4X6EiS22AhUdVHkjpUmg0oA&oe=63DA49CA"))
        listCategory.add(Qservicedataclass("Asif","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/312568940_3230201747230007_8369135975538212220_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeE1rg1VyEAM6RLjSDHn8lggUvDuV39rGm5S8O5Xf2sabmkE8l5YbgcclyefLA844sWkozfMhtCXHW1bG1Yay8q_&_nc_ohc=Hf_vlMFLDTMAX8P75Kp&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDM2pUv0CRC3i0bHisnVUwSkDiY9tyhR04qd3d45p5N9Q&oe=63D8A86D"))
        listCategory.add(Qservicedataclass("Nahin","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273497723_3032348303672667_7408001268607770204_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeH46Rjz0O0cc_lGiAZPTMcfFTFG9noVeMIVMUb2ehV4whvVDO0JYldteB2P0AffgB7UwypOUGpFmmgrOJL-B6H0&_nc_ohc=iechLSpJiSYAX-leT1r&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDEVtP_AVetqQQ24DSDOY_2AubEYDAixEtfdNo9Tsc95A&oe=63DA479E"))
        listCategory.add(Qservicedataclass("Hemi","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273722099_1666879373657438_2557287155176625846_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEQWVI02c2tte8ExQdn18QIhkzuMd5-X6uGTO4x3n5fq7LqF8DlqE522mWtftQdScDyg5shaUxe4oSyObE86Ky1&_nc_ohc=0FQl1FlayoUAX_ZudEg&tn=YnVnIqmCkg8_2YG9&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDVypMYZJ63IRLJu9BY3nXujksdDoSpCe431CZxPTRQFQ&oe=63DA92CB"))
        listCategory.add(Qservicedataclass("Samera","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/307187810_3194254780834453_5733062472254682968_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeFtwx7f2LpEzd0CLj2Imous5RGUovHPeYrlEZSi8c95ijbxQytGQVOqxUACaYlyc9u4e3UBfNeCnNSGzSY8b1M3&_nc_ohc=0zAJx03BSKAAX_tmjtz&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDxZbOLNS_p6dfIu82849V4X6EiS22AhUdVHkjpUmg0oA&oe=63DA49CA"))
        listCategory.add(Qservicedataclass("Asif","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/312568940_3230201747230007_8369135975538212220_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeE1rg1VyEAM6RLjSDHn8lggUvDuV39rGm5S8O5Xf2sabmkE8l5YbgcclyefLA844sWkozfMhtCXHW1bG1Yay8q_&_nc_ohc=Hf_vlMFLDTMAX8P75Kp&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDM2pUv0CRC3i0bHisnVUwSkDiY9tyhR04qd3d45p5N9Q&oe=63D8A86D"))
        listCategory.add(Qservicedataclass("Nahin","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273497723_3032348303672667_7408001268607770204_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeH46Rjz0O0cc_lGiAZPTMcfFTFG9noVeMIVMUb2ehV4whvVDO0JYldteB2P0AffgB7UwypOUGpFmmgrOJL-B6H0&_nc_ohc=iechLSpJiSYAX-leT1r&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDEVtP_AVetqQQ24DSDOY_2AubEYDAixEtfdNo9Tsc95A&oe=63DA479E"))
        listCategory.add(Qservicedataclass("Hemi","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/273722099_1666879373657438_2557287155176625846_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEQWVI02c2tte8ExQdn18QIhkzuMd5-X6uGTO4x3n5fq7LqF8DlqE522mWtftQdScDyg5shaUxe4oSyObE86Ky1&_nc_ohc=0FQl1FlayoUAX_ZudEg&tn=YnVnIqmCkg8_2YG9&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDVypMYZJ63IRLJu9BY3nXujksdDoSpCe431CZxPTRQFQ&oe=63DA92CB"))
        listCategory.add(Qservicedataclass("Samera","https://scontent.fdac136-1.fna.fbcdn.net/v/t39.30808-6/307187810_3194254780834453_5733062472254682968_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeFtwx7f2LpEzd0CLj2Imous5RGUovHPeYrlEZSi8c95ijbxQytGQVOqxUACaYlyc9u4e3UBfNeCnNSGzSY8b1M3&_nc_ohc=0zAJx03BSKAAX_tmjtz&_nc_ht=scontent.fdac136-1.fna&oh=00_AfDxZbOLNS_p6dfIu82849V4X6EiS22AhUdVHkjpUmg0oA&oe=63DA49CA"))

        binding.apply {
            rvServices.apply {
                layoutManager = GridLayoutManager(context, 3)
                adapter = QserviceAdapter(requireContext(),listCategory)
            }
        }

    }
}