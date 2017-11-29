TDV.PlayerAPI.defineScript({ "definitions": [
 {
  "class": "Panorama",
  "thumbnailUrl": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_t.jpg",
  "id": "panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51",
  "partial": false,
  "hfovMin": 41,
  "hfovMax": 140,
  "pitch": 0,
  "vfov": 180,
  "adjacentPanoramas": [
   {
    "class": "AdjacentPanorama",
    "yaw": -14.36,
    "backwardYaw": -175.21,
    "distance": 1,
    "panorama": {
     "class": "Panorama",
     "thumbnailUrl": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_t.jpg",
     "id": "panorama_C103CDA9_C646_3F4B_41D6_42E516724410",
     "partial": false,
     "hfovMin": 40,
     "hfovMax": 140,
     "pitch": 0,
     "vfov": 180,
     "adjacentPanoramas": [
      {
       "class": "AdjacentPanorama",
       "yaw": 14.61,
       "backwardYaw": 31.78,
       "distance": 1,
       "panorama": {
        "class": "Panorama",
        "thumbnailUrl": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_t.jpg",
        "id": "panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B",
        "partial": false,
        "hfovMin": 40,
        "hfovMax": 140,
        "pitch": 0,
        "vfov": 180,
        "adjacentPanoramas": [
         {
          "class": "AdjacentPanorama",
          "yaw": 31.78,
          "backwardYaw": 14.61,
          "distance": 1,
          "panorama": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410"
         }
        ],
        "hfov": 360,
        "label": "9 \u00c1REA FUMAR",
        "frames": [
         {
          "top": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_u_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_u.jpeg",
             "width": 1024
            }
           ]
          },
          "thumbnailUrl": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_t.jpg",
          "bottom": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_d_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_d.jpeg",
             "width": 1024
            }
           ]
          },
          "left": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_l_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_l.jpeg",
             "width": 1024
            }
           ]
          },
          "class": "CubicPanoramaFrame",
          "right": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_r_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_r.jpeg",
             "width": 1024
            }
           ]
          },
          "front": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_f_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_f.jpeg",
             "width": 1024
            }
           ]
          },
          "overlays": [
           {
            "rollOverDisplay": false,
            "id": "overlay_EAAF71B5_E0C8_D4C7_41DF_F54856538588",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 6.64,
              "pitch": -37.61,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 196,
                 "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_0_HS_1_0.png",
                 "width": 218
                }
               ]
              },
              "yaw": 93.7
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "mapColor": "#FF0000",
              "toolTip": "TORRE",
              "click": "this.mainPlayList.set('selectedIndex', 2)",
              "class": "HotspotPanoramaOverlayArea",
              "displayTooltipInTouchScreens": true
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 98,
                 "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_0_HS_1_0_0_map.gif",
                 "width": 109
                }
               ]
              },
              "yaw": 93.7,
              "hfov": 6.64,
              "pitch": -37.61
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EA1F84DD_E0C9_3C47_41E3_5EDA2C4B6A0D",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 7.25,
              "pitch": -37.81,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 196,
                 "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_0_HS_0_0.png",
                 "width": 239
                }
               ]
              },
              "yaw": 31.78
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "mapColor": "#FF0000",
              "toolTip": "PLAZA CENTRAL",
              "click": "this.startPanoramaWithCamera(this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410, this.camera_E930843A_E172_A753_41DF_BD8770C0D024); this.mainPlayList.set('selectedIndex', 1)",
              "class": "HotspotPanoramaOverlayArea",
              "displayTooltipInTouchScreens": true
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 98,
                 "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_0_HS_0_0_0_map.gif",
                 "width": 119
                }
               ]
              },
              "yaw": 31.78,
              "hfov": 7.25,
              "pitch": -37.81
             }
            ]
           }
          ],
          "back": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_b_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_b.jpeg",
             "width": 1024
            }
           ]
          }
         }
        ]
       }
      },
      {
       "class": "AdjacentPanorama",
       "yaw": -53.75,
       "backwardYaw": -91.08,
       "distance": 1,
       "panorama": {
        "class": "Panorama",
        "thumbnailUrl": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_t.jpg",
        "id": "panorama_E8216F36_E072_552B_41BD_17C8990681BD",
        "partial": false,
        "hfovMin": 60,
        "hfovMax": 135,
        "pitch": 0,
        "vfov": 180,
        "adjacentPanoramas": [
         {
          "class": "AdjacentPanorama",
          "yaw": 109.47,
          "backwardYaw": 155.39,
          "distance": 1,
          "panorama": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410"
         }
        ],
        "hfov": 360,
        "label": "10 A\u00c9REA",
        "frames": [
         {
          "top": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_u_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_u.jpeg",
             "width": 1024
            }
           ]
          },
          "thumbnailUrl": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_t.jpg",
          "bottom": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_d_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_d.jpeg",
             "width": 1024
            }
           ]
          },
          "left": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_l_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_l.jpeg",
             "width": 1024
            }
           ]
          },
          "class": "CubicPanoramaFrame",
          "right": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_r_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_r.jpeg",
             "width": 1024
            }
           ]
          },
          "front": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_f_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_f.jpeg",
             "width": 1024
            }
           ]
          },
          "overlays": [
           {
            "rollOverDisplay": false,
            "id": "overlay_EBB326FC_E0F7_FC45_41D0_02A37BBFFE91",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 3.47,
              "pitch": -52.02,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 165,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_4_0.png",
                 "width": 156
                }
               ]
              },
              "yaw": -49.51
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 2)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 82,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_4_0_0_map.gif",
                 "width": 78
                }
               ]
              },
              "yaw": -49.51,
              "hfov": 3.47,
              "pitch": -52.02
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EB619304_E0F9_55C5_41DE_00CE68EB51F9",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 4.71,
              "pitch": -33.48,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 181,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_3_0.png",
                 "width": 156
                }
               ]
              },
              "yaw": -32.07
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 3)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 90,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_3_0_0_map.gif",
                 "width": 78
                }
               ]
              },
              "yaw": -32.07,
              "hfov": 4.71,
              "pitch": -33.48
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EB433BB4_E0F9_54C5_41DB_736ED0B19636",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 2.42,
              "pitch": -69.28,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 165,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_2_0.png",
                 "width": 189
                }
               ]
              },
              "yaw": 109.47
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 1)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 82,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_2_0_0_map.gif",
                 "width": 94
                }
               ]
              },
              "yaw": 109.47,
              "hfov": 2.42,
              "pitch": -69.28
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EB4E6F7C_E0FB_4C45_4184_4FDF2B5E814E",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 4.98,
              "pitch": -37.05,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 225,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_1_0.png",
                 "width": 173
                }
               ]
              },
              "yaw": 42.17
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 8)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 112,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_1_0_0_map.gif",
                 "width": 86
                }
               ]
              },
              "yaw": 42.17,
              "hfov": 4.98,
              "pitch": -37.05
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EB2BB07C_E0FB_3445_41D9_F3EC8E588F4B",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 3.87,
              "pitch": -46.67,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 187,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_0_0.png",
                 "width": 156
                }
               ]
              },
              "yaw": 130.69
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 0)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 93,
                 "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_0_HS_0_0_0_map.gif",
                 "width": 78
                }
               ]
              },
              "yaw": 130.69,
              "hfov": 3.87,
              "pitch": -46.67
             }
            ]
           }
          ],
          "back": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 3176,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_b_hq.jpeg",
             "width": 3176
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E8216F36_E072_552B_41BD_17C8990681BD_b.jpeg",
             "width": 1024
            }
           ]
          }
         }
        ]
       }
      },
      {
       "class": "AdjacentPanorama",
       "yaw": -175.21,
       "backwardYaw": -14.36,
       "distance": 1,
       "panorama": "this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51"
      },
      {
       "class": "AdjacentPanorama",
       "yaw": -105.06,
       "backwardYaw": 178,
       "distance": 1,
       "panorama": {
        "class": "Panorama",
        "thumbnailUrl": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_t.jpg",
        "id": "panorama_C103590A_C646_0749_41DB_78432EFBC75A",
        "partial": false,
        "hfovMin": 40,
        "hfovMax": 140,
        "pitch": 0,
        "vfov": 180,
        "adjacentPanoramas": [
         {
          "class": "AdjacentPanorama",
          "yaw": -88.15,
          "backwardYaw": 155.39,
          "distance": 1,
          "panorama": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410"
         }
        ],
        "hfov": 360,
        "label": "5 LOBBY T I",
        "frames": [
         {
          "top": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_u_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_u.jpeg",
             "width": 1024
            }
           ]
          },
          "thumbnailUrl": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_t.jpg",
          "bottom": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_d_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_d.jpeg",
             "width": 1024
            }
           ]
          },
          "left": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_l_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_l.jpeg",
             "width": 1024
            }
           ]
          },
          "class": "CubicPanoramaFrame",
          "right": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_r_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_r.jpeg",
             "width": 1024
            }
           ]
          },
          "front": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_f_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_f.jpeg",
             "width": 1024
            }
           ]
          },
          "overlays": [
           {
            "rollOverDisplay": false,
            "id": "overlay_EAAD8495_E0D7_DCC7_41D5_D69E03E256BF",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 7.96,
              "pitch": -33.71,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 202,
                 "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_0_HS_0_0.png",
                 "width": 249
                }
               ]
              },
              "yaw": -88.15
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "mapColor": "#FF0000",
              "toolTip": "SALIR",
              "click": "this.mainPlayList.set('selectedIndex', 1)",
              "class": "HotspotPanoramaOverlayArea",
              "displayTooltipInTouchScreens": true
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 101,
                 "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_0_HS_0_0_0_map.gif",
                 "width": 124
                }
               ]
              },
              "yaw": -88.15,
              "hfov": 7.96,
              "pitch": -33.71
             }
            ]
           }
          ],
          "back": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_b_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C103590A_C646_0749_41DB_78432EFBC75A_b.jpeg",
             "width": 1024
            }
           ]
          }
         }
        ]
       }
      },
      {
       "class": "AdjacentPanorama",
       "yaw": -34.8,
       "backwardYaw": 143.61,
       "distance": 1,
       "panorama": {
        "class": "Panorama",
        "thumbnailUrl": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_t.jpg",
        "id": "panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676",
        "partial": false,
        "hfovMin": 60,
        "hfovMax": 131,
        "pitch": 0,
        "vfov": 180,
        "adjacentPanoramas": [
         {
          "class": "AdjacentPanorama",
          "yaw": 61.35,
          "backwardYaw": 159.59,
          "distance": 1,
          "panorama": {
           "class": "Panorama",
           "thumbnailUrl": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_t.jpg",
           "id": "panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D",
           "partial": false,
           "hfovMin": 40,
           "hfovMax": 140,
           "pitch": 0,
           "vfov": 178.17,
           "adjacentPanoramas": [
            {
             "class": "AdjacentPanorama",
             "yaw": -138.94,
             "backwardYaw": -47.28,
             "distance": 1,
             "panorama": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676"
            },
            {
             "class": "AdjacentPanorama",
             "yaw": -83.37,
             "backwardYaw": 70.48,
             "distance": 1,
             "panorama": {
              "class": "Panorama",
              "thumbnailUrl": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_t.jpg",
              "id": "panorama_C17B76D6_C642_0AD9_41E3_260C53C27363",
              "partial": false,
              "hfovMin": 40,
              "hfovMax": 140,
              "pitch": 0,
              "vfov": 180,
              "adjacentPanoramas": [
               {
                "class": "AdjacentPanorama",
                "yaw": 70.48,
                "backwardYaw": -83.37,
                "distance": 1,
                "panorama": "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D"
               }
              ],
              "hfov": 360,
              "label": "7 \u00c1REA COM\u00daN T. II",
              "frames": [
               {
                "top": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_u_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_u.jpeg",
                   "width": 1024
                  }
                 ]
                },
                "thumbnailUrl": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_t.jpg",
                "bottom": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_d_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_d.jpeg",
                   "width": 1024
                  }
                 ]
                },
                "left": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_l_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_l.jpeg",
                   "width": 1024
                  }
                 ]
                },
                "class": "CubicPanoramaFrame",
                "right": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_r_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_r.jpeg",
                   "width": 1024
                  }
                 ]
                },
                "front": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_f_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_f.jpeg",
                   "width": 1024
                  }
                 ]
                },
                "overlays": [
                 {
                  "rollOverDisplay": false,
                  "id": "overlay_EA3ABCF5_E0C9_CC47_41EA_3A01AAE5FC4E",
                  "items": [
                   {
                    "class": "HotspotPanoramaOverlayImage",
                    "hfov": 8.01,
                    "pitch": -24.21,
                    "image": {
                     "class": "ImageResource",
                     "levels": [
                      {
                       "class": "ImageResourceLevel",
                       "height": 212,
                       "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_0_HS_0_0.png",
                       "width": 229
                      }
                     ]
                    },
                    "yaw": 70.48
                   }
                  ],
                  "class": "HotspotPanoramaOverlay",
                  "enabledInCardboard": true,
                  "useHandCursor": true,
                  "areas": [
                   {
                    "class": "HotspotPanoramaOverlayArea",
                    "mapColor": "#FF0000",
                    "click": "this.startPanoramaWithCamera(this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D, this.camera_E9212454_E172_A7D7_41E5_4866A9F7084B); this.mainPlayList.set('selectedIndex', 5)"
                   }
                  ],
                  "maps": [
                   {
                    "class": "HotspotPanoramaOverlayMap",
                    "image": {
                     "class": "ImageResource",
                     "levels": [
                      {
                       "class": "ImageResourceLevel",
                       "height": 106,
                       "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_0_HS_0_0_0_map.gif",
                       "width": 114
                      }
                     ]
                    },
                    "yaw": 70.48,
                    "hfov": 8.01,
                    "pitch": -24.21
                   }
                  ]
                 }
                ],
                "back": {
                 "class": "ImageResource",
                 "levels": [
                  {
                   "class": "ImageResourceLevel",
                   "height": 2992,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_b_hq.jpeg",
                   "width": 2992
                  },
                  {
                   "class": "ImageResourceLevel",
                   "height": 1024,
                   "url": "media/panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_b.jpeg",
                   "width": 1024
                  }
                 ]
                }
               }
              ]
             }
            }
           ],
           "hfov": 360,
           "label": "6 LOBBY TORRE II",
           "frames": [
            {
             "top": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_u_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_u.jpeg",
                "width": 1024
               }
              ]
             },
             "thumbnailUrl": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_t.jpg",
             "bottom": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_d_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_d.jpeg",
                "width": 1024
               }
              ]
             },
             "left": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_l_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_l.jpeg",
                "width": 1024
               }
              ]
             },
             "class": "CubicPanoramaFrame",
             "right": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_r_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_r.jpeg",
                "width": 1024
               }
              ]
             },
             "front": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_f_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_f.jpeg",
                "width": 1024
               }
              ]
             },
             "overlays": [
              {
               "rollOverDisplay": false,
               "id": "overlay_EAA0063E_E0D7_3FC5_41E6_2B6188E00F99",
               "items": [
                {
                 "class": "HotspotPanoramaOverlayImage",
                 "hfov": 6.32,
                 "pitch": -32.71,
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 184,
                    "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_0_HS_1_0.png",
                    "width": 196
                   }
                  ]
                 },
                 "yaw": -138.94
                }
               ],
               "class": "HotspotPanoramaOverlay",
               "enabledInCardboard": true,
               "useHandCursor": true,
               "areas": [
                {
                 "mapColor": "#FF0000",
                 "toolTip": "SALIR",
                 "click": "this.mainPlayList.set('selectedIndex', 2)",
                 "class": "HotspotPanoramaOverlayArea",
                 "displayTooltipInTouchScreens": true
                }
               ],
               "maps": [
                {
                 "class": "HotspotPanoramaOverlayMap",
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 92,
                    "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_0_HS_1_0_0_map.gif",
                    "width": 98
                   }
                  ]
                 },
                 "yaw": -138.94,
                 "hfov": 6.32,
                 "pitch": -32.71
                }
               ]
              },
              {
               "rollOverDisplay": false,
               "id": "overlay_EA1A01D5_E0C9_5447_41DB_59970F18C3EE",
               "items": [
                {
                 "class": "HotspotPanoramaOverlayImage",
                 "hfov": 5.64,
                 "pitch": -18.37,
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 153,
                    "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_0_HS_0_0.png",
                    "width": 155
                   }
                  ]
                 },
                 "yaw": -83.37
                }
               ],
               "class": "HotspotPanoramaOverlay",
               "enabledInCardboard": true,
               "useHandCursor": true,
               "areas": [
                {
                 "class": "HotspotPanoramaOverlayArea",
                 "mapColor": "#FF0000",
                 "click": "this.startPanoramaWithCamera(this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363, this.camera_E949D42F_E172_A771_4186_C0EEE76C592A); this.mainPlayList.set('selectedIndex', 6)"
                }
               ],
               "maps": [
                {
                 "class": "HotspotPanoramaOverlayMap",
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 76,
                    "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_0_HS_0_0_0_map.gif",
                    "width": 77
                   }
                  ]
                 },
                 "yaw": -83.37,
                 "hfov": 5.64,
                 "pitch": -18.37
                }
               ]
              }
             ],
             "back": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_b_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_b.jpeg",
                "width": 1024
               }
              ]
             }
            }
           ]
          }
         },
         {
          "class": "AdjacentPanorama",
          "yaw": 143.61,
          "backwardYaw": -34.8,
          "distance": 1,
          "panorama": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410"
         },
         {
          "class": "AdjacentPanorama",
          "yaw": -27.96,
          "backwardYaw": 98.76,
          "distance": 1,
          "panorama": {
           "class": "Panorama",
           "thumbnailUrl": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_t.jpg",
           "id": "panorama_E783D52B_E071_D539_41D3_D06D31BEDA58",
           "partial": false,
           "hfovMin": 80,
           "hfovMax": 132,
           "pitch": 0,
           "vfov": 180,
           "adjacentPanoramas": [
            {
             "class": "AdjacentPanorama",
             "yaw": 98.76,
             "backwardYaw": -27.96,
             "distance": 1,
             "panorama": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676"
            }
           ],
           "hfov": 360,
           "label": "4 FUENTE",
           "frames": [
            {
             "top": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_u_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_u.jpeg",
                "width": 1024
               }
              ]
             },
             "thumbnailUrl": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_t.jpg",
             "bottom": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_d_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_d.jpeg",
                "width": 1024
               }
              ]
             },
             "left": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_l_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_l.jpeg",
                "width": 1024
               }
              ]
             },
             "class": "CubicPanoramaFrame",
             "right": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_r_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_r.jpeg",
                "width": 1024
               }
              ]
             },
             "front": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_f_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_f.jpeg",
                "width": 1024
               }
              ]
             },
             "overlays": [
              {
               "rollOverDisplay": false,
               "id": "overlay_EB6EFEDB_E0F8_CC43_41E3_26A5249DED1A",
               "items": [
                {
                 "class": "HotspotPanoramaOverlayImage",
                 "hfov": 7.74,
                 "pitch": -34.43,
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 259,
                    "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_0_HS_0_0.png",
                    "width": 244
                   }
                  ]
                 },
                 "yaw": 98.76
                }
               ],
               "class": "HotspotPanoramaOverlay",
               "enabledInCardboard": true,
               "useHandCursor": true,
               "areas": [
                {
                 "class": "HotspotPanoramaOverlayArea",
                 "mapColor": "#FF0000",
                 "click": "this.startPanoramaWithCamera(this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676, this.camera_E9F77495_E172_A751_41C9_DEB8096E6554); this.mainPlayList.set('selectedIndex', 2)"
                }
               ],
               "maps": [
                {
                 "class": "HotspotPanoramaOverlayMap",
                 "image": {
                  "class": "ImageResource",
                  "levels": [
                   {
                    "class": "ImageResourceLevel",
                    "height": 129,
                    "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_0_HS_0_0_0_map.gif",
                    "width": 122
                   }
                  ]
                 },
                 "yaw": 98.76,
                 "hfov": 7.74,
                 "pitch": -34.43
                }
               ]
              }
             ],
             "back": {
              "class": "ImageResource",
              "levels": [
               {
                "class": "ImageResourceLevel",
                "height": 2992,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_b_hq.jpeg",
                "width": 2992
               },
               {
                "class": "ImageResourceLevel",
                "height": 1024,
                "url": "media/panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_b.jpeg",
                "width": 1024
               }
              ]
             }
            }
           ]
          }
         }
        ],
        "hfov": 360,
        "label": "3 ESTACIONA",
        "frames": [
         {
          "top": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_u_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_u.jpeg",
             "width": 1024
            }
           ]
          },
          "thumbnailUrl": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_t.jpg",
          "bottom": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_d_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_d.jpeg",
             "width": 1024
            }
           ]
          },
          "left": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_l_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_l.jpeg",
             "width": 1024
            }
           ]
          },
          "class": "CubicPanoramaFrame",
          "right": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_r_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_r.jpeg",
             "width": 1024
            }
           ]
          },
          "front": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_f_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_f.jpeg",
             "width": 1024
            }
           ]
          },
          "overlays": [
           {
            "rollOverDisplay": false,
            "id": "overlay_EB7B0393_E0FF_74C3_41E2_E494F573399D",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 7.16,
              "pitch": -26.39,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 243,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_2_0.png",
                 "width": 208
                }
               ]
              },
              "yaw": -27.96
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.startPanoramaWithCamera(this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58, this.camera_E911D46C_E172_A7F7_41E2_55791F4F8951); this.mainPlayList.set('selectedIndex', 3)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 121,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_2_0_0_map.gif",
                 "width": 104
                }
               ]
              },
              "yaw": -27.96,
              "hfov": 7.16,
              "pitch": -26.39
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_EB15B423_E0F9_53C3_41DD_D564AB15093D",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 7.06,
              "pitch": -27.88,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 196,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_1_0.png",
                 "width": 208
                }
               ]
              },
              "yaw": 61.35
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 5)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 98,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_1_0_0_map.gif",
                 "width": 104
                }
               ]
              },
              "yaw": 61.35,
              "hfov": 7.06,
              "pitch": -27.88
             }
            ]
           },
           {
            "rollOverDisplay": false,
            "id": "overlay_ECE79C43_E0F9_4C43_41B0_ECB76936BC96",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 7.77,
              "pitch": -25.1,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 196,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_0_0.png",
                 "width": 224
                }
               ]
              },
              "yaw": 143.61
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.startPanoramaWithCamera(this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410, this.camera_E9294462_E172_A7F3_41E0_175D1E1F82BA); this.mainPlayList.set('selectedIndex', 1)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 98,
                 "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_0_HS_0_0_0_map.gif",
                 "width": 112
                }
               ]
              },
              "yaw": 143.61,
              "hfov": 7.77,
              "pitch": -25.1
             }
            ]
           }
          ],
          "back": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2984,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_b_hq.jpeg",
             "width": 2984
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_b.jpeg",
             "width": 1024
            }
           ]
          }
         }
        ]
       }
      },
      {
       "class": "AdjacentPanorama",
       "yaw": 83.87,
       "backwardYaw": -131.76,
       "distance": 1,
       "panorama": {
        "class": "Panorama",
        "thumbnailUrl": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_t.jpg",
        "id": "panorama_C17E228E_C646_0549_41D8_3BA256784C13",
        "partial": false,
        "hfovMin": 40,
        "hfovMax": 140,
        "pitch": 0,
        "vfov": 180,
        "adjacentPanoramas": [
         {
          "class": "AdjacentPanorama",
          "yaw": 92.51,
          "backwardYaw": 155.39,
          "distance": 1,
          "panorama": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410"
         }
        ],
        "hfov": 360,
        "label": "8 LOBBY PC",
        "frames": [
         {
          "top": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_u_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_u.jpeg",
             "width": 1024
            }
           ]
          },
          "thumbnailUrl": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_t.jpg",
          "bottom": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_d_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_d.jpeg",
             "width": 1024
            }
           ]
          },
          "left": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_l_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_l.jpeg",
             "width": 1024
            }
           ]
          },
          "class": "CubicPanoramaFrame",
          "right": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_r_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_r.jpeg",
             "width": 1024
            }
           ]
          },
          "front": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_f_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_f.jpeg",
             "width": 1024
            }
           ]
          },
          "overlays": [
           {
            "rollOverDisplay": false,
            "id": "overlay_EA6B0AD5_E0C9_5447_41D0_472736A67086",
            "items": [
             {
              "class": "HotspotPanoramaOverlayImage",
              "hfov": 6.75,
              "pitch": -32.35,
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 222,
                 "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_0_HS_0_0.png",
                 "width": 208
                }
               ]
              },
              "yaw": 92.51
             }
            ],
            "class": "HotspotPanoramaOverlay",
            "enabledInCardboard": true,
            "useHandCursor": true,
            "areas": [
             {
              "class": "HotspotPanoramaOverlayArea",
              "mapColor": "#FF0000",
              "click": "this.mainPlayList.set('selectedIndex', 1)"
             }
            ],
            "maps": [
             {
              "class": "HotspotPanoramaOverlayMap",
              "image": {
               "class": "ImageResource",
               "levels": [
                {
                 "class": "ImageResourceLevel",
                 "height": 111,
                 "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_0_HS_0_0_0_map.gif",
                 "width": 104
                }
               ]
              },
              "yaw": 92.51,
              "hfov": 6.75,
              "pitch": -32.35
             }
            ]
           }
          ],
          "back": {
           "class": "ImageResource",
           "levels": [
            {
             "class": "ImageResourceLevel",
             "height": 2992,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_b_hq.jpeg",
             "width": 2992
            },
            {
             "class": "ImageResourceLevel",
             "height": 1024,
             "url": "media/panorama_C17E228E_C646_0549_41D8_3BA256784C13_b.jpeg",
             "width": 1024
            }
           ]
          }
         }
        ]
       }
      }
     ],
     "hfov": 360,
     "label": "2 PLAZA CENTRAL",
     "frames": [
      {
       "top": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_u_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_u.jpeg",
          "width": 1024
         }
        ]
       },
       "thumbnailUrl": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_t.jpg",
       "bottom": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_d_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_d.jpeg",
          "width": 1024
         }
        ]
       },
       "left": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_l_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_l.jpeg",
          "width": 1024
         }
        ]
       },
       "class": "CubicPanoramaFrame",
       "right": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_r_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_r.jpeg",
          "width": 1024
         }
        ]
       },
       "front": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_f_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_f.jpeg",
          "width": 1024
         }
        ]
       },
       "overlays": [
        {
         "rollOverDisplay": false,
         "id": "overlay_EADF7716_E0D8_FDC2_41DD_F3B04479E461",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 7.81,
           "pitch": -33.64,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 238,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_5_0.png",
              "width": 244
             }
            ]
           },
           "yaw": 83.87
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "class": "HotspotPanoramaOverlayArea",
           "mapColor": "#FF0000",
           "click": "this.mainPlayList.set('selectedIndex', 7)"
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 119,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_5_0_0_map.gif",
              "width": 122
             }
            ]
           },
           "yaw": 83.87,
           "hfov": 7.81,
           "pitch": -33.64
          }
         ]
        },
        {
         "rollOverDisplay": false,
         "id": "overlay_EAA21876_E0D9_5442_41E1_5C8A5AC32DD6",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 7.67,
           "pitch": -26.69,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 207,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_4_0.png",
              "width": 224
             }
            ]
           },
           "yaw": -105.06
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "mapColor": "#FF0000",
           "toolTip": "TORRE",
           "click": "this.mainPlayList.set('selectedIndex', 4)",
           "class": "HotspotPanoramaOverlayArea",
           "displayTooltipInTouchScreens": true
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 103,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_4_0_0_map.gif",
              "width": 112
             }
            ]
           },
           "yaw": -105.06,
           "hfov": 7.67,
           "pitch": -26.69
          }
         ]
        },
        {
         "rollOverDisplay": false,
         "id": "overlay_EAB5063E_E0D9_3FC5_41B2_B6880AECBC9A",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 6.96,
           "pitch": -19.85,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 181,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_3_0.png",
              "width": 193
             }
            ]
           },
           "yaw": -34.8
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "class": "HotspotPanoramaOverlayArea",
           "mapColor": "#FF0000",
           "click": "this.startPanoramaWithCamera(this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676, this.camera_E90EF48B_E172_A731_41EB_055A1EDE2590); this.mainPlayList.set('selectedIndex', 2)"
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 90,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_3_0_0_map.gif",
              "width": 96
             }
            ]
           },
           "yaw": -34.8,
           "hfov": 6.96,
           "pitch": -19.85
          }
         ]
        },
        {
         "rollOverDisplay": false,
         "id": "overlay_EA58830E_E0DB_55C5_41DB_E292DB2A29AA",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 6.56,
           "pitch": -30.17,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 191,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_2_0.png",
              "width": 198
             }
            ]
           },
           "yaw": -175.21
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "mapColor": "#FF0000",
           "toolTip": "ACCESO SUR",
           "click": "this.startPanoramaWithCamera(this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51, this.camera_E906A481_E172_A731_41EC_24FBE6E81CC2); this.mainPlayList.set('selectedIndex', 0)",
           "class": "HotspotPanoramaOverlayArea",
           "displayTooltipInTouchScreens": true
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 95,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_2_0_0_map.gif",
              "width": 99
             }
            ]
           },
           "yaw": -175.21,
           "hfov": 6.56,
           "pitch": -30.17
          }
         ]
        },
        {
         "rollOverDisplay": false,
         "id": "overlay_EA720C75_E0D9_CC47_41C3_F9DB47B872B0",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 6.11,
           "pitch": -22.23,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 171,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_1_0.png",
              "width": 172
             }
            ]
           },
           "yaw": 14.61
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "class": "HotspotPanoramaOverlayArea",
           "mapColor": "#FF0000",
           "click": "this.startPanoramaWithCamera(this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B, this.camera_E91E1476_E172_A7D3_41CD_4C464AA3281F); this.mainPlayList.set('selectedIndex', 8)"
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 85,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_1_0_0_map.gif",
              "width": 86
             }
            ]
           },
           "yaw": 14.61,
           "hfov": 6.11,
           "pitch": -22.23
          }
         ]
        },
        {
         "rollOverDisplay": false,
         "id": "overlay_EBD2FD4C_E0CB_CC45_41E7_0513A74A33A2",
         "items": [
          {
           "class": "HotspotPanoramaOverlayImage",
           "hfov": 10.57,
           "pitch": 42.52,
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 354,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_0_0.png",
              "width": 374
             }
            ]
           },
           "yaw": -53.75
          }
         ],
         "class": "HotspotPanoramaOverlay",
         "enabledInCardboard": true,
         "useHandCursor": true,
         "areas": [
          {
           "class": "HotspotPanoramaOverlayArea",
           "mapColor": "#FF0000",
           "click": "this.mainPlayList.set('selectedIndex', 9)"
          }
         ],
         "maps": [
          {
           "class": "HotspotPanoramaOverlayMap",
           "image": {
            "class": "ImageResource",
            "levels": [
             {
              "class": "ImageResourceLevel",
              "height": 177,
              "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_0_HS_0_0_0_map.gif",
              "width": 187
             }
            ]
           },
           "yaw": -53.75,
           "hfov": 10.57,
           "pitch": 42.52
          }
         ]
        }
       ],
       "back": {
        "class": "ImageResource",
        "levels": [
         {
          "class": "ImageResourceLevel",
          "height": 2992,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_b_hq.jpeg",
          "width": 2992
         },
         {
          "class": "ImageResourceLevel",
          "height": 1024,
          "url": "media/panorama_C103CDA9_C646_3F4B_41D6_42E516724410_b.jpeg",
          "width": 1024
         }
        ]
       }
      }
     ]
    }
   }
  ],
  "hfov": 360,
  "label": "1 ACCESO SUR",
  "frames": [
   {
    "top": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_u_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_u.jpeg",
       "width": 1591
      }
     ]
    },
    "thumbnailUrl": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_t.jpg",
    "bottom": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_d_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_d.jpeg",
       "width": 1591
      }
     ]
    },
    "left": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_l_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_l.jpeg",
       "width": 1591
      }
     ]
    },
    "class": "CubicPanoramaFrame",
    "right": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_r_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_r.jpeg",
       "width": 1591
      }
     ]
    },
    "front": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_f_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_f.jpeg",
       "width": 1591
      }
     ]
    },
    "overlays": [
     {
      "rollOverDisplay": false,
      "id": "overlay_E972C6F2_E0D8_DC42_41D2_4F5FFF0B40D9",
      "items": [
       {
        "class": "HotspotPanoramaOverlayImage",
        "hfov": 6.5,
        "pitch": -33.44,
        "image": {
         "class": "ImageResource",
         "levels": [
          {
           "class": "ImageResourceLevel",
           "height": 185,
           "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_0_HS_0_0.png",
           "width": 202
          }
         ]
        },
        "yaw": -14.36
       }
      ],
      "class": "HotspotPanoramaOverlay",
      "enabledInCardboard": true,
      "useHandCursor": true,
      "areas": [
       {
        "class": "HotspotPanoramaOverlayArea",
        "mapColor": "#FF0000",
        "click": "this.startPanoramaWithCamera(this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410, this.camera_E939144A_E172_A733_41EB_77A9ED9F0F75); this.mainPlayList.set('selectedIndex', 1)"
       }
      ],
      "maps": [
       {
        "class": "HotspotPanoramaOverlayMap",
        "image": {
         "class": "ImageResource",
         "levels": [
          {
           "class": "ImageResourceLevel",
           "height": 92,
           "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_0_HS_0_0_0_map.gif",
           "width": 101
          }
         ]
        },
        "yaw": -14.36,
        "hfov": 6.5,
        "pitch": -33.44
       }
      ]
     }
    ],
    "back": {
     "class": "ImageResource",
     "levels": [
      {
       "class": "ImageResourceLevel",
       "height": 2976,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_b_hq.jpeg",
       "width": 2976
      },
      {
       "class": "ImageResourceLevel",
       "height": 1591,
       "url": "media/panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_b.jpeg",
       "width": 1591
      }
     ]
    }
   }
  ]
 },
 {
  "mouseControlMode": "drag_acceleration",
  "buttonPause": {
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41BC_DB59BC8AC3A2_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41BC_DB59BC8AC3A2.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "toggle",
   "height": 40,
   "id": "IconButton_5645B517_5EBA_61DA_41BC_DB59BC8AC3A2",
   "width": 40,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "touchControlMode": "drag_rotation",
  "id": "MainViewerPanoramaPlayer",
  "buttonZoomIn": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D2_D639DF8052CA_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D2_D639DF8052CA_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D2_D639DF8052CA.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41D2_D639DF8052CA",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "buttonZoomOut": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D3_52532616D552_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D3_52532616D552_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D3_52532616D552.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41D3_52532616D552",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "preloadEnabled": false,
  "buttonMoveUp": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_9282B67C524F_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_9282B67C524F_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_9282B67C524F.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41D6_9282B67C524F",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "displayPlaybackBar": true,
  "gyroscopeEnabled": true,
  "buttonMoveDown": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_E94D03438B44_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_E94D03438B44_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D6_E94D03438B44.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41D6_E94D03438B44",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "gyroscopeVerticalDraggingEnabled": true,
  "buttonPlayLeft": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D1_EAD81768A56B_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D1_EAD81768A56B_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D1_EAD81768A56B.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 40,
   "id": "IconButton_5645B517_5EBA_61DA_41D1_EAD81768A56B",
   "width": 40,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "class": "PanoramaPlayer",
  "buttonMoveRight": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41BA_A43ED1B1FB40_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41BA_A43ED1B1FB40_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41BA_A43ED1B1FB40.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41BA_A43ED1B1FB40",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "viewerArea": "this.MainViewer",
  "buttonRestart": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D4_85AB00D87A76_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41D4_85AB00D87A76_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41D4_85AB00D87A76.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 40,
   "id": "IconButton_5645B517_5EBA_61DA_41D4_85AB00D87A76",
   "width": 40,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "buttonPlayRight": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41C5_1BC8156F8BCF_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41C5_1BC8156F8BCF_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41C5_1BC8156F8BCF.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 40,
   "id": "IconButton_5645B517_5EBA_61DA_41C5_1BC8156F8BCF",
   "width": 40,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  },
  "buttonMoveLeft": {
   "rollOverIconURL": "skin/IconButton_5645B517_5EBA_61DA_41A9_0D8835A41A7C_rollover.png",
   "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41A9_0D8835A41A7C_pressed.png",
   "transparencyActive": true,
   "shadow": false,
   "minWidth": 0,
   "paddingTop": 0,
   "borderSize": 0,
   "horizontalAlign": "center",
   "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41A9_0D8835A41A7C.png",
   "paddingRight": 0,
   "class": "IconButton",
   "cursor": "hand",
   "paddingLeft": 0,
   "borderRadius": 0,
   "verticalAlign": "middle",
   "mode": "push",
   "height": 32,
   "id": "IconButton_5645B517_5EBA_61DA_41A9_0D8835A41A7C",
   "width": 32,
   "backgroundOpacity": 0,
   "minHeight": 0,
   "paddingBottom": 0
  }
 },
 {
  "id": "panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -14.93,
   "hfov": 134,
   "pitch": -1.4
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410",
 {
  "id": "panorama_C103CDA9_C646_3F4B_41D6_42E516724410_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -24.61,
   "hfov": 100,
   "pitch": 3.46
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676",
 {
  "id": "panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 132.72,
   "hfov": 108,
   "pitch": 2.11
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58",
 {
  "id": "panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 42.42,
   "hfov": 117,
   "pitch": -1.04
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C103590A_C646_0749_41DB_78432EFBC75A",
 {
  "id": "panorama_C103590A_C646_0749_41DB_78432EFBC75A_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -2,
   "hfov": 123,
   "pitch": -0.67
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D",
 {
  "id": "panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -20.41,
   "hfov": 131,
   "pitch": -2.58
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363",
 {
  "id": "panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -69.05,
   "hfov": 100,
   "pitch": -0.2
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C17E228E_C646_0549_41D8_3BA256784C13",
 {
  "id": "panorama_C17E228E_C646_0549_41D8_3BA256784C13_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 48.24,
   "hfov": 123,
   "pitch": 2.12
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B",
 {
  "id": "panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 105.34,
   "hfov": 100,
   "pitch": 1.78
  },
  "automaticZoomSpeed": 10
 },
 "this.panorama_E8216F36_E072_552B_41BD_17C8990681BD",
 {
  "id": "panorama_E8216F36_E072_552B_41BD_17C8990681BD_camera",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 88.92,
   "hfov": 123,
   "pitch": -41.06
  },
  "automaticZoomSpeed": 10
 },
 {
  "class": "PlayList",
  "id": "mainPlayList",
  "items": [
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 0, 1)",
    "camera": "this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 1, 2)",
    "camera": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 2, 3)",
    "camera": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 3, 4)",
    "camera": "this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C103590A_C646_0749_41DB_78432EFBC75A",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 4, 5)",
    "camera": "this.panorama_C103590A_C646_0749_41DB_78432EFBC75A_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 5, 6)",
    "camera": "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 6, 7)",
    "camera": "this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C17E228E_C646_0549_41D8_3BA256784C13",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 7, 8)",
    "camera": "this.panorama_C17E228E_C646_0549_41D8_3BA256784C13_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 8, 9)",
    "camera": "this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E8216F36_E072_552B_41BD_17C8990681BD",
    "begin": "this.setEndToItemIndex(this.mainPlayList, 9, 0)",
    "camera": "this.panorama_E8216F36_E072_552B_41BD_17C8990681BD_camera"
   }
  ]
 },
 {
  "class": "PlayList",
  "id": "ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist",
  "items": [
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 0, 1)",
    "camera": "this.panorama_C1FD99FB_C646_06CF_41D4_8DBC88643B51_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 1, 2)",
    "camera": "this.panorama_C103CDA9_C646_3F4B_41D6_42E516724410_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 2, 3)",
    "camera": "this.panorama_E7AF8C71_E076_7B28_41D6_EE47D74E6676_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 3, 4)",
    "camera": "this.panorama_E783D52B_E071_D539_41D3_D06D31BEDA58_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C103590A_C646_0749_41DB_78432EFBC75A",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 4, 5)",
    "camera": "this.panorama_C103590A_C646_0749_41DB_78432EFBC75A_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 5, 6)",
    "camera": "this.panorama_C172E7A7_C646_0B47_41D6_841ACDA4CD1D_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 6, 7)",
    "camera": "this.panorama_C17B76D6_C642_0AD9_41E3_260C53C27363_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C17E228E_C646_0549_41D8_3BA256784C13",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 7, 8)",
    "camera": "this.panorama_C17E228E_C646_0549_41D8_3BA256784C13_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 8, 9)",
    "camera": "this.panorama_C179F5F6_C646_0ED9_41E1_9C5BD1F0CC8B_camera"
   },
   {
    "player": "this.MainViewerPanoramaPlayer",
    "class": "PanoramaPlayListItem",
    "media": "this.panorama_E8216F36_E072_552B_41BD_17C8990681BD",
    "begin": "this.setEndToItemIndex(this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist, 9, 0)",
    "camera": "this.panorama_E8216F36_E072_552B_41BD_17C8990681BD_camera"
   }
  ]
 },
 {
  "id": "camera_E949D42F_E172_A771_4186_C0EEE76C592A",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -109.52,
   "hfov": 100,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E930843A_E172_A753_41DF_BD8770C0D024",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -165.39,
   "hfov": 100,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E939144A_E172_A733_41EB_77A9ED9F0F75",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 4.79,
   "hfov": 100,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E9212454_E172_A7D7_41E5_4866A9F7084B",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 96.63,
   "hfov": 131,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E9294462_E172_A7F3_41E0_175D1E1F82BA",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 145.2,
   "hfov": 100,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E911D46C_E172_A7F7_41E2_55791F4F8951",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -81.24,
   "hfov": 117,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E91E1476_E172_A7D3_41CD_4C464AA3281F",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -148.22,
   "hfov": 100,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E906A481_E172_A731_41EC_24FBE6E81CC2",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 165.64,
   "hfov": 134,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E90EF48B_E172_A731_41EB_055A1EDE2590",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": -36.39,
   "hfov": 108,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 },
 {
  "id": "camera_E9F77495_E172_A751_41C9_DEB8096E6554",
  "initialSequence": {
   "class": "PanoramaCameraSequence",
   "restartMovementOnUserInteraction": false,
   "movements": [
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_in",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 323,
     "easing": "linear",
     "yawSpeed": 7.96
    },
    {
     "class": "DistancePanoramaCameraMovement",
     "yawDelta": 18.5,
     "easing": "cubic_out",
     "yawSpeed": 7.96
    }
   ]
  },
  "class": "PanoramaCamera",
  "initialPosition": {
   "class": "PanoramaCameraPosition",
   "yaw": 152.04,
   "hfov": 108,
   "pitch": 0
  },
  "automaticZoomSpeed": 10
 }
], "children": [
 {
  "toolTipOpacity": 1,
  "shadow": false,
  "toolTipShadowColor": "#333333",
  "top": 0,
  "toolTipPaddingBottom": 4,
  "paddingTop": 0,
  "playbackBarBorderColor": "#AAAAAA",
  "playbackBarProgressBorderSize": 0,
  "progressBarBackgroundColorDirection": "vertical",
  "playbackBarBackgroundColorDirection": "vertical",
  "toolTipBorderColor": "#767676",
  "toolTipBackgroundColor": "#F6F6F6",
  "toolTipFontSize": 12,
  "playbackBarHeadWidth": 6,
  "playbackBarRight": 0,
  "toolTipBorderSize": 1,
  "progressLeft": 10,
  "progressBackgroundColorRatios": [
   0,
   1
  ],
  "playbackBarHeadShadowBlurRadius": 3,
  "playbackBarHeadShadowHorizontalLength": 0,
  "toolTipShadowVerticalLength": 0,
  "playbackBarLeft": 0,
  "paddingRight": 0,
  "toolTipPaddingTop": 4,
  "playbackBarHeadShadowVerticalLength": 0,
  "toolTipFontColor": "#606060",
  "playbackBarHeadHeight": 30,
  "playbackBarHeadBackgroundColorRatios": [
   0,
   1
  ],
  "playbackBarHeadBorderColor": "#000000",
  "playbackBarHeadShadow": true,
  "toolTipShadowSpread": 0,
  "toolTipFontFamily": "Arial",
  "progressBarBorderRadius": 4,
  "playbackBarProgressOpacity": 1,
  "borderRadius": 0,
  "progressBackgroundOpacity": 1,
  "progressBarBorderSize": 0,
  "playbackBarProgressBorderRadius": 0,
  "transitionMode": "blending",
  "id": "MainViewer",
  "playbackBarHeadOpacity": 1,
  "toolTipPaddingLeft": 6,
  "progressBarBackgroundColorRatios": [
   0,
   1
  ],
  "playbackBarOpacity": 1,
  "width": "100%",
  "playbackBarBorderSize": 2,
  "playbackBarHeadBackgroundColor": [
   "#111111",
   "#666666"
  ],
  "progressBackgroundColorDirection": "vertical",
  "toolTipTextShadowBlurRadius": 3,
  "paddingBottom": 0,
  "progressBarBorderColor": "#000000",
  "playbackBarBackgroundOpacity": 1,
  "minHeight": 50,
  "progressBarOpacity": 1,
  "progressBottom": 1,
  "minWidth": 100,
  "toolTipFontWeight": "normal",
  "toolTipPaddingRight": 6,
  "borderSize": 0,
  "progressHeight": 20,
  "toolTipShadowBlurRadius": 3,
  "playbackBarBottom": 10,
  "playbackBarHeadBorderSize": 0,
  "playbackBarBorderRadius": 4,
  "toolTipShadowHorizontalLength": 0,
  "playbackBarHeadShadowColor": "#000000",
  "progressBorderColor": "#AAAAAA",
  "progressBarBackgroundColor": [
   "#222222",
   "#444444"
  ],
  "progressBorderSize": 2,
  "class": "ViewerArea",
  "height": "100%",
  "playbackBarHeadBackgroundColorDirection": "vertical",
  "playbackBarProgressBorderColor": "#000000",
  "playbackBarProgressBackgroundColor": [
   "#222222",
   "#444444"
  ],
  "toolTipFontStyle": "normal",
  "toolTipBorderRadius": 3,
  "playbackBarHeadBorderRadius": 0,
  "progressBackgroundColor": [
   "#EEEEEE",
   "#CCCCCC"
  ],
  "playbackBarProgressBackgroundColorDirection": "vertical",
  "left": 0,
  "paddingLeft": 0,
  "toolTipShadowOpacity": 1,
  "toolTipTextShadowOpacity": 0,
  "playbackBarHeadShadowOpacity": 0.7,
  "progressRight": 10,
  "toolTipTextShadowColor": "#000000",
  "playbackBarBackgroundColor": [
   "#EEEEEE",
   "#CCCCCC"
  ],
  "progressBorderRadius": 4,
  "playbackBarHeight": 20,
  "playbackBarProgressBackgroundColorRatios": [
   0,
   1
  ],
  "progressOpacity": 1
 },
 {
  "children": [
   {
    "shadow": false,
    "minWidth": 360,
    "paddingTop": 0,
    "borderSize": 0,
    "horizontalAlign": "center",
    "gap": 4,
    "scrollBarColor": "#000000",
    "paddingRight": 0,
    "scrollBarVisible": "rollOver",
    "class": "Container",
    "scrollBarOpacity": 0.5,
    "paddingLeft": 0,
    "scrollBarWidth": 10,
    "scrollBarMargin": 2,
    "borderRadius": 0,
    "verticalAlign": "middle",
    "id": "Container_5645B517_5EBA_61DA_41CE_5170204AEC9E",
    "width": 360,
    "backgroundOpacity": 0,
    "overflow": "hidden",
    "children": [
     "this.IconButton_5645B517_5EBA_61DA_41D3_52532616D552",
     "this.IconButton_5645B517_5EBA_61DA_41D4_85AB00D87A76",
     "this.IconButton_5645B517_5EBA_61DA_41D1_EAD81768A56B",
     "this.IconButton_5645B517_5EBA_61DA_41A9_0D8835A41A7C",
     {
      "shadow": false,
      "minWidth": 20,
      "paddingTop": 0,
      "borderSize": 0,
      "horizontalAlign": "center",
      "gap": 4,
      "scrollBarColor": "#000000",
      "paddingRight": 0,
      "class": "Container",
      "scrollBarVisible": "rollOver",
      "scrollBarOpacity": 0.5,
      "paddingLeft": 0,
      "scrollBarWidth": 10,
      "scrollBarMargin": 2,
      "borderRadius": 0,
      "verticalAlign": "middle",
      "id": "Container_5645B517_5EBA_61DA_41AF_FC7FEB37EBCD",
      "width": 40,
      "backgroundOpacity": 0,
      "overflow": "hidden",
      "children": [
       "this.IconButton_5645B517_5EBA_61DA_41D6_9282B67C524F",
       "this.IconButton_5645B517_5EBA_61DA_41BC_DB59BC8AC3A2",
       "this.IconButton_5645B517_5EBA_61DA_41D6_E94D03438B44"
      ],
      "contentOpaque": false,
      "paddingBottom": 0,
      "minHeight": 20,
      "height": "100%",
      "layout": "vertical"
     },
     "this.IconButton_5645B517_5EBA_61DA_41BA_A43ED1B1FB40",
     "this.IconButton_5645B517_5EBA_61DA_41C5_1BC8156F8BCF",
     {
      "pressedIconURL": "skin/IconButton_5645B517_5EBA_61DA_41CB_7C4DBBC2A8E5_pressed.png",
      "transparencyActive": true,
      "shadow": false,
      "minWidth": 0,
      "paddingTop": 0,
      "borderSize": 0,
      "horizontalAlign": "center",
      "iconURL": "skin/IconButton_5645B517_5EBA_61DA_41CB_7C4DBBC2A8E5.png",
      "paddingRight": 0,
      "class": "IconButton",
      "cursor": "hand",
      "paddingLeft": 0,
      "borderRadius": 0,
      "verticalAlign": "middle",
      "mode": "toggle",
      "height": 40,
      "id": "IconButton_5645B517_5EBA_61DA_41CB_7C4DBBC2A8E5",
      "width": 40,
      "backgroundOpacity": 0,
      "minHeight": 0,
      "paddingBottom": 0
     },
     "this.IconButton_5645B517_5EBA_61DA_41D2_D639DF8052CA"
    ],
    "contentOpaque": false,
    "paddingBottom": 0,
    "minHeight": 20,
    "height": "96.479%",
    "layout": "horizontal"
   }
  ],
  "shadow": false,
  "minWidth": 1,
  "paddingTop": 0,
  "bottom": "0%",
  "borderSize": 0,
  "horizontalAlign": "center",
  "scrollBarColor": "#000000",
  "paddingRight": 0,
  "class": "Container",
  "scrollBarVisible": "rollOver",
  "gap": 10,
  "scrollBarOpacity": 0.5,
  "paddingLeft": 0,
  "scrollBarWidth": 10,
  "left": "0%",
  "borderRadius": 0,
  "verticalAlign": "middle",
  "backgroundOpacity": 0,
  "height": 142,
  "scrollBarMargin": 2,
  "contentOpaque": false,
  "overflow": "scroll",
  "paddingBottom": 0,
  "minHeight": 1,
  "width": "100%",
  "layout": "horizontal"
 },
 {
  "layout": "vertical",
  "itemLabelFontSize": 14,
  "shadow": false,
  "itemThumbnailShadowHorizontalLength": 3,
  "paddingTop": 10,
  "bottom": "18.42%",
  "itemLabelFontWeight": "normal",
  "itemLabelGap": 8,
  "itemThumbnailShadowVerticalLength": 3,
  "itemOpacity": 1,
  "itemLabelPosition": "bottom",
  "itemVerticalAlign": "middle",
  "itemThumbnailShadowSpread": 1,
  "itemThumbnailShadowColor": "#000000",
  "scrollBarColor": "#FFFFFF",
  "paddingRight": 20,
  "itemMode": "normal",
  "itemThumbnailShadow": true,
  "itemBorderRadius": 0,
  "itemThumbnailHeight": 75,
  "itemBackgroundColor": [],
  "itemThumbnailBorderRadius": 5,
  "borderRadius": 5,
  "itemPaddingBottom": 3,
  "backgroundColorDirection": "vertical",
  "scrollBarWidth": 10,
  "itemLabelHorizontalAlign": "center",
  "backgroundOpacity": 0.31,
  "itemLabelTextDecoration": "none",
  "itemPaddingRight": 3,
  "id": "ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573",
  "backgroundColorRatios": [
   0
  ],
  "itemThumbnailScaleMode": "fit_outside",
  "height": "61.842%",
  "itemThumbnailWidth": 100,
  "paddingBottom": 10,
  "itemBackgroundColorDirection": "vertical",
  "itemThumbnailOpacity": 1,
  "rollOverItemBackgroundOpacity": 0,
  "minHeight": 20,
  "gap": 13,
  "minWidth": 20,
  "horizontalAlign": "left",
  "borderSize": 0,
  "itemLabelFontFamily": "Arial",
  "itemLabelFontStyle": "normal",
  "selectedItemLabelFontColor": "#FFCC00",
  "itemHorizontalAlign": "center",
  "class": "ThumbnailList",
  "scrollBarVisible": "rollOver",
  "itemPaddingTop": 3,
  "scrollBarOpacity": 0.5,
  "itemThumbnailShadowOpacity": 0.27,
  "itemBackgroundOpacity": 0,
  "playList": "this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist",
  "paddingLeft": 20,
  "scrollBarMargin": 2,
  "backgroundColor": [
   "#000000"
  ],
  "right": "0%",
  "verticalAlign": "top",
  "itemThumbnailShadowBlurRadius": 8,
  "selectedItemLabelFontWeight": "bold",
  "itemBackgroundColorRatios": [],
  "rollOverItemLabelFontWeight": "bold",
  "itemLabelFontColor": "#FFFFFF",
  "itemPaddingLeft": 3
 }
], 
 "buttonToggleMute": "this.IconButton_5645B517_5EBA_61DA_41CB_7C4DBBC2A8E5",
 "shadow": false,
 "minWidth": 20,
 "paddingTop": 0,
 "borderSize": 0,
 "horizontalAlign": "left",
 "gap": 10,
 "scrollBarColor": "#000000",
 "paddingRight": 0,
 "class": "Player",
 "scrollBarVisible": "rollOver",
 "start": "this.syncPlaylists([this.ThumbnailList_CF8E4154_C642_07D9_41B1_F26E14647573_playlist,this.mainPlayList]); this.mainPlayList.set('selectedIndex', 0)",
 "backgroundPreloadEnabled": true,
 "scrollBarOpacity": 0.5,
 "scripts": {
  "autotriggerAtStart": function(player, callback){    var stateChangeFunction = function(event){        if(event.data.state == 'playing'){           callback();           player.unbind('stateChange', stateChangeFunction, this);       }   };   player.bind('stateChange', stateChangeFunction, this); },
  "getActivePlayerWithViewer": function(viewerArea){    var players = this.getByClassName('PanoramaPlayer');   players = players.concat(this.getByClassName('VideoPlayer'));   players = players.concat(this.getByClassName('Video360Player'));   players = players.concat(this.getByClassName('PhotoAlbumPlayer'));   players = players.concat(this.getByClassName('MapPlayer'));   var i = players.length;   while(i-- > 0){       var player = players[i];       if(player.get('viewerArea') == viewerArea) {           var playerClass = player.get('class');           if(playerClass == 'PanoramaPlayer' && player.get('panorama') != undefined) return player;           else if((playerClass == 'VideoPlayer' || playerClass == 'Video360Player') && player.get('video') != undefined) return player;           else if(playerClass == 'PhotoAlbumPlayer' && player.get('photoAlbum') != undefined) return player;           else if(playerClass == 'MapPlayer' && player.get('map') != undefined) return player;       }   }   return undefined; },
  "playGlobalAudioWhilePlay": function(playList, index, audio, endCallback){    var changeFunction = function(event){       if(event.data.previousSelectedIndex == index){           this.stopGlobalAudio(audio);           if(isPanorama) {               var media = playListItem.get('media');               var audios = media.get('audios');               audios.splice(audios.indexOf(audio), 1);               media.set('audios', audios);           }           playList.unbind('change', changeFunction, this);           if(endCallback)               endCallback();       }   };   playList.bind('change', changeFunction, this);   var playListItem = playList.get('items')[index];   var isPanorama = playListItem.get('class') == 'PanoramaPlayListItem';   if(isPanorama) {       var media = playListItem.get('media');       var audios = (media.get('audios') || []).slice();       if(audio.get('class') == 'MediaAudio') {           var panoramaAudio = this.rootPlayer.createInstance('PanoramaAudio');           panoramaAudio.set('autoplay', false);           panoramaAudio.set('audio', audio.get('audio'));           panoramaAudio.set('loop', audio.get('loop'));           audio = panoramaAudio;       }       audios.push(audio);       media.set('audios', audios);   }   this.playGlobalAudio(audio, endCallback); },
  "registerKey": function(key, value){    window[key] = value; },
  "showWindow": function(w, autoCloseMilliSeconds, containsAudio){    var closeFunction = function(){       clearAutoClose();       this.resumePlayers(playersPaused, !containsAudio);       w.unbind('close', closeFunction, this);   };   var clearAutoClose = function(){       w.unbind('click', clearAutoClose, this);       if(timeoutID != undefined){           clearTimeout(timeoutID);       }   };   var timeoutID = undefined;   if(autoCloseMilliSeconds){       var autoCloseFunction = function(){           w.hide();       };       w.bind('click', clearAutoClose, this);       timeoutID = setTimeout(autoCloseFunction, autoCloseMilliSeconds);   }   var playersPaused = this.pauseCurrentPlayers(!containsAudio);   w.bind('close', closeFunction, this);   w.show(this, true); },
  "setMediaBehaviour": function(playList, index, mediaDispatcher){    var self = this;   var stateChangeFunction = function(event){       if(event.data.state == 'stopped'){           dispose();       }   };   var changeFunction = function(){       var index = playListDispatcher.get('selectedIndex');       if(index != -1){           indexDispatcher = index;           dispose();       }   };   var dispose = function(){       if(!playListDispatcher) return;       playList.set('selectedIndex', -1);       if(panoramaSequence && panoramaSequenceIndex != -1){           if(panoramaSequence) {               if(panoramaSequenceIndex > 0 && panoramaSequence.get('movements')[panoramaSequenceIndex-1].get('class') == 'TargetPanoramaCameraMovement'){                   var initialPosition = camera.get('initialPosition');                   var oldYaw = initialPosition.get('yaw');                   var oldPitch = initialPosition.get('pitch');                   var oldHfov = initialPosition.get('hfov');                   var previousMovement = panoramaSequence.get('movements')[panoramaSequenceIndex-1];                   initialPosition.set('yaw', previousMovement.get('targetYaw'));                   initialPosition.set('pitch', previousMovement.get('targetPitch'));                   initialPosition.set('hfov', previousMovement.get('targetHfov'));                   var restoreInitialPositionFunction = function(event){                       initialPosition.set('yaw', oldYaw);                       initialPosition.set('pitch', oldPitch);                       initialPosition.set('hfov', oldHfov);                       itemDispatcher.unbind('end', restoreInitialPositionFunction, self);                   };                   itemDispatcher.bind('end', restoreInitialPositionFunction, self);               }               panoramaSequence.set('movementIndex', panoramaSequenceIndex);           }       }       playListDispatcher.set('selectedIndex', indexDispatcher);       if(player){           player.unbind('stateChange', stateChangeFunction, self);       }       if(sameViewerArea){           if(playList != playListDispatcher)               playListDispatcher.unbind('change', changeFunction, self);       }       else{           viewerArea.set('visible', false);       }       playListDispatcher = undefined;   };   if(!mediaDispatcher){       var currentIndex = playList.get('selectedIndex');       var currentPlayer = (currentIndex != -1) ? playList.get('items')[playList.get('selectedIndex')].get('player') : this.getActivePlayerWithViewer(this.MainViewer);       if(currentPlayer) {           var playerClass = currentPlayer.get('class');           if(playerClass == 'PanoramaPlayer') mediaDispatcher = currentPlayer.get('panorama');           else if(playerClass == 'VideoPlayer' || playerClass == 'Video360Player') mediaDispatcher = currentPlayer.get('video');           else if(playerClass == 'PhotoAlbumPlayer') mediaDispatcher = currentPlayer.get('photoAlbum');           else if(playerClass == 'MapPlayer') mediaDispatcher = currentPlayer.get('map');       }   }   var playListDispatcher = mediaDispatcher ? this.getPlayListWithMedia(mediaDispatcher, true) : undefined;   if(!playListDispatcher){       playList.set('selectedIndex', index);       return;   }   var indexDispatcher = playListDispatcher.get('selectedIndex');   if(playList.get('selectedIndex') == index || indexDispatcher == -1){       return;   }   var item = playList.get('items')[index];   var itemDispatcher = playListDispatcher.get('items')[indexDispatcher];   var viewerArea = item.get('player').get('viewerArea');   var sameViewerArea = viewerArea == itemDispatcher.get('player').get('viewerArea');   if(sameViewerArea){       if(playList != playListDispatcher){           playListDispatcher.set('selectedIndex', -1);           playListDispatcher.bind('change', changeFunction, this);       }   }   else{       viewerArea.set('visible', true);   }   var panoramaSequenceIndex = -1;   var panoramaSequence = undefined;   var camera = itemDispatcher.get('camera');   if(camera){       panoramaSequence = camera.get('initialSequence');       if(panoramaSequence) {           panoramaSequenceIndex = panoramaSequence.get('movementIndex');       }   }   playList.set('selectedIndex', index);   var player = undefined;   if(item.get('player') != itemDispatcher.get('player')){       player = item.get('player');       player.bind('stateChange', stateChangeFunction, this);   }   this.executeFunctionWhenChange(playList, index, dispose); },
  "pauseCurrentPlayers": function(onlyPauseCameraIfPanorama){    var players = this.getByClassName('PanoramaPlayer');   players = players.concat(this.getByClassName('VideoPlayer'));   players = players.concat(this.getByClassName('Video360Player'));   players = players.concat(this.getByClassName('PhotoAlbumPlayer'));   var i = players.length;   while(i-- > 0){       var player = players[i];       if(player.get('state') == 'playing') {           if(onlyPauseCameraIfPanorama && player.get('class') == 'PanoramaPlayer' && typeof player.get('video') === 'undefined'){               player.pauseCamera();           }           else{               player.pause();           }       }       else {           players.splice(i, 1);       }   }   return players; },
  "loadFromCurrentMediaPlayList": function(playList, delta){    var currentIndex = playList.get('selectedIndex');   var totalItems = playList.get('items').length;   var newIndex = (currentIndex + delta) % totalItems;   while(newIndex < 0){       newIndex = totalItems + newIndex;   };   if(currentIndex != newIndex){       playList.set('selectedIndex', newIndex);   }; },
  "resumeGlobalAudios": function(caller){    if(window.currentGlobalAudiosActionCaller && window.currentGlobalAudiosActionCaller != caller)       return;   window.currentGlobalAudiosActionCaller = undefined;   var audios = window.currentGlobalAudios;   if(!audios) return;   for(var i = 0, count = audios.length; i<count; i++){       audios[i].play();   } },
  "loopAlbum": function(playList, index){    var playListItem = playList.get('items')[index];   var player = playListItem.get('player');   var loopFunction = function(){       player.play();   };   this.executeFunctionWhenChange(playList, index, loopFunction); },
  "showPopupImage": function(image, toggleImage, customWidth, customHeight, showEffect, hideEffect, closeButtonProperties, autoCloseMilliSeconds, audio, stopBackgroundAudio, loadedCallback, hideCallback){    var self = this;   var closed = false;   var playerClickFunction = function() {       zoomImage.unbind('loaded', loadedFunction, self);       hideFunction();   };   var clearAutoClose = function(){       zoomImage.unbind('click', clearAutoClose, this);       if(timeoutID != undefined){           clearTimeout(timeoutID);       }   };   var loadedFunction = function(){       self.unbind('click', playerClickFunction, self);       veil.set('visible', true);       setCloseButtonPosition();       closeButton.set('visible', true);       zoomImage.unbind('loaded', loadedFunction, this);       zoomImage.bind('userInteractionStart', userInteractionStartFunction, this);       zoomImage.bind('userInteractionEnd', userInteractionEndFunction, this);       timeoutID = setTimeout(timeoutFunction, 200);   };   var timeoutFunction = function(){       timeoutID = undefined;       if(autoCloseMilliSeconds){           var autoCloseFunction = function(){               hideFunction();           };           zoomImage.bind('click', clearAutoClose, this);           timeoutID = setTimeout(autoCloseFunction, autoCloseMilliSeconds);       }       zoomImage.bind('backgroundClick', hideFunction, this);       if(toggleImage) {           zoomImage.bind('click', toggleFunction, this);           zoomImage.set('imageCursor', 'hand');       }       closeButton.bind('click', hideFunction, this);       if(loadedCallback)           loadedCallback();   };   var hideFunction = function() {       closed = true;       if(timeoutID)           clearTimeout(timeoutID);       if(autoCloseMilliSeconds)           clearAutoClose();       if(hideCallback)           hideCallback();       zoomImage.set('visible', false);       if(hideEffect && hideEffect.get('duration') > 0){           hideEffect.bind('end', endEffectFunction, this);       }       else{           zoomImage.set('image', null);       }       closeButton.set('visible', false);       veil.set('visible', false);       self.unbind('click', playerClickFunction, self);       zoomImage.unbind('backgroundClick', hideFunction, this);       zoomImage.unbind('userInteractionStart', userInteractionStartFunction, this);       zoomImage.unbind('userInteractionEnd', userInteractionEndFunction, this, true);       if(toggleImage) {           zoomImage.unbind('click', toggleFunction, this);           zoomImage.set('cursor', 'default');       }       closeButton.unbind('click', hideFunction, this);       self.resumePlayers(playersPaused, audio == null || stopBackgroundAudio);       if(audio){           if(stopBackgroundAudio){               self.resumeGlobalAudios();           }           self.stopGlobalAudio(audio);       }   };   var endEffectFunction = function() {       zoomImage.set('image', null);       hideEffect.unbind('end', endEffectFunction, this);   };   var toggleFunction = function() {       zoomImage.set('image', isToggleVisible() ? image : toggleImage);   };   var isToggleVisible = function() {       return zoomImage.get('image') == toggleImage;   };   var setCloseButtonPosition = function() {       var right = zoomImage.get('actualWidth') - zoomImage.get('imageLeft') - zoomImage.get('imageWidth') + 10;       var top = zoomImage.get('imageTop') + 10;       if(right < 10) right = 10;       if(top < 10) top = 10;       closeButton.set('right', right);       closeButton.set('top', top);   };   var userInteractionStartFunction = function() {       if(timeoutUserInteractionID){           clearTimeout(timeoutUserInteractionID);           timeoutUserInteractionID = undefined;       }       else{           closeButton.set('visible', false);       }   };   var userInteractionEndFunction = function() {       if(!closed){           timeoutUserInteractionID = setTimeout(userInteractionTimeoutFunction, 300);       }   };   var userInteractionTimeoutFunction = function() {       timeoutUserInteractionID = undefined;       closeButton.set('visible', true);       setCloseButtonPosition();   };   var veil = this.veilPopupPanorama;   var zoomImage = this.zoomImagePopupPanorama;   var closeButton = this.closeButtonPopupPanorama;   if(closeButtonProperties){       for(var key in closeButtonProperties){           closeButton.set(key, closeButtonProperties[key]);       }   }   var playersPaused = this.pauseCurrentPlayers(audio == null || !stopBackgroundAudio);   if(audio){       if(stopBackgroundAudio){           this.pauseGlobalAudios();       }       this.playGlobalAudio(audio);   }   var timeoutID = undefined;   var timeoutUserInteractionID = undefined;   zoomImage.bind('loaded', loadedFunction, this);   setTimeout(function(){ self.bind('click', playerClickFunction, self, false); }, 0);   zoomImage.set('image', image);   zoomImage.set('customWidth', customWidth);   zoomImage.set('customHeight', customHeight);   zoomImage.set('showEffect', showEffect);   zoomImage.set('hideEffect', hideEffect);   zoomImage.set('visible', true);   return zoomImage; },
  "setComponentVisibility": function(component, visible, applyAt, effect, propertyEffect, ignoreClearTimeout){    this.unregisterKey('visibility_'+component.get('id'));   var changeVisibility = function(){        if(effect && propertyEffect){            component.set(propertyEffect, effect);        }        component.set('visible', visible);       if(component.get('class') == 'ViewerArea'){           try{               if(visible) component.restart();               else        component.pause();           }           catch(e){};       }   };   var effectTimeoutName = 'effectTimeout_'+component.get('id');   if(!ignoreClearTimeout && window.hasOwnProperty(effectTimeoutName)){       var effectTimeout = window[effectTimeoutName];       if(effectTimeout instanceof Array){           for(var i=0; i<effectTimeout.length; i++){ clearTimeout(effectTimeout[i]) }       }else{           clearTimeout(effectTimeout);       }       delete window[effectTimeoutName];   }   else if(visible == component.get('visible') && !ignoreClearTimeout)       return;   if(applyAt && applyAt > 0){       var effectTimeout = setTimeout(function(){            if(window[effectTimeoutName] instanceof Array) {                var arrayTimeoutVal = window[effectTimeoutName];               var index = arrayTimeoutVal.indexOf(effectTimeout);               arrayTimeoutVal.splice(index, 1);               if(arrayTimeoutVal.length == 0){                   delete window[effectTimeoutName];               }           }else{               delete window[effectTimeoutName];            }           changeVisibility();        }, applyAt);       if(window.hasOwnProperty(effectTimeoutName)){           window[effectTimeoutName] = [window[effectTimeoutName], effectTimeout];       }else{           window[effectTimeoutName] = effectTimeout;       }   }   else{       changeVisibility();   } },
  "setMapLocation": function(panoramaPlayListItem, mapPlayer){    var resetFunction = function(){       panoramaPlayListItem.unbind('stop', resetFunction, this);       player.set('mapPlayer', null);   };   panoramaPlayListItem.bind('stop', resetFunction, this);   var player = panoramaPlayListItem.get('player');   player.set('mapPlayer', mapPlayer); },
  "showComponentsWhileMouseOver": function(parentComponent, components, durationVisibleWhileOut){    var setVisibility = function(visible){       for(var i = 0, length = components.length; i<length; i++){           components[i].set('visible', visible);       }   };   if (this.rootPlayer.touchEnabled){       setVisibility(true);   } else {       var timeoutID = -1;       var rollOverFunction = function(){           setVisibility(true);           if(timeoutID >= 0) clearTimeout(timeoutID);           parentComponent.unbind('rollOver', rollOverFunction, this);           parentComponent.bind('rollOut', rollOutFunction, this);       };       var rollOutFunction = function(){           var timeoutFunction = function(){               setVisibility(false);               parentComponent.unbind('rollOver', rollOverFunction, this);           };           parentComponent.unbind('rollOut', rollOutFunction, this);           parentComponent.bind('rollOver', rollOverFunction, this);           timeoutID = setTimeout(timeoutFunction, durationVisibleWhileOut);       };       parentComponent.bind('rollOver', rollOverFunction, this);   } },
  "setEndToItemIndex": function(playList, fromIndex, toIndex){    var endFunction = function(){       if(playList.get('selectedIndex') == fromIndex)           playList.set('selectedIndex', toIndex);   };   this.executeFunctionWhenChange(playList, fromIndex, endFunction); },
  "visibleComponentsIfPlayerFlagEnabled": function(components, playerFlag){    var enabled = this.get(playerFlag);   for(var i in components){       components[i].set('visible', enabled);   } },
  "executeFunctionWhenChange": function(playList, index, endFunction, changeFunction){    var self = this;   var endObject = undefined;   var changePlayListFunction = function(event){       if(event.data.previousSelectedIndex == index){           if(changeFunction) changeFunction();           if(endFunction) endObject.unbind('end', endFunction, self);           playList.unbind('change', changePlayListFunction, self);       }   };   if(endFunction){       var playListItem = playList.get('items')[index];       var playListItemClass = playListItem.get('class');       if(playListItemClass == 'PanoramaPlayListItem'){           var camera = playListItem.get('camera');           endObject = camera.get('initialSequence');           if(!endObject) return;       }       else{           endObject = playListItem.get('media');       }       endObject.bind('end', endFunction, this);   }   playList.bind('change', changePlayListFunction, this); },
  "shareTwitter": function(url){    window.open('https://twitter.com/intent/tweet?source=webclient&url=' + url, '_blank'); },
  "changeBackgroundWhilePlay": function(playList, index, color){    var changeFunction = function(event){       if(event.data.previousSelectedIndex == index){           playList.unbind('change', changeFunction, this);           if((color == viewerArea.get('backgroundColor')) && (colorRatios == viewerArea.get('backgroundColorRatios'))){               viewerArea.set('backgroundColor', backgroundColorBackup);               viewerArea.set('backgroundColorRatios', backgroundColorRatiosBackup);           }       }   };   var playListItem = playList.get('items')[index];   var player = playListItem.get('player');   var viewerArea = player.get('viewerArea');   var backgroundColorBackup = viewerArea.get('backgroundColor');   var backgroundColorRatiosBackup = viewerArea.get('backgroundColorRatios');   var colorRatios = [0];   if((color != backgroundColorBackup) || (colorRatios != backgroundColorRatiosBackup)){       viewerArea.set('backgroundColor', color);       viewerArea.set('backgroundColorRatios', colorRatios);       playList.bind('change', changeFunction, this);   } },
  "getPlayListWithMedia": function(media, onlySelected){    var playLists = this.getByClassName('PlayList');   for(var i = 0, count = playLists.length; i<count; ++i){       var playList = playLists[i];       if(onlySelected && playList.get('selectedIndex') == -1)           continue;       var items = playList.get('items');       for(var j = 0, countJ = items.length; j<countJ; ++j){           if(items[j].get('media') == media)               return playList;       }   }   return undefined; },
  "updateMediaLabelFromPlayList": function(playList, htmlText, playListItemStopToDispose){    var changeFunction = function(){       var index = playList.get('selectedIndex');       if(index >= 0){           var beginFunction = function(){               playListItem.unbind('begin', beginFunction);               setMediaLabel(index);           };           var setMediaLabel = function(index){               var media = playListItem.get('media');               var text = media.get('data');               if(!text)                   text = media.get('label');               setHtml(text);           };           var setHtml = function(text){               if(text !== undefined)                   htmlText.set('html', '<div style=\"text-align:left\"><SPAN STYLE=\"color:#FFFFFF;font-size:12px;font-family:Verdana\"><span color=\"white\" font-family=\"Verdana\" font-size=\"12px\">' + text + '</SPAN></div>');               else                   htmlText.set('html', '');           };           var playListItem = playList.get('items')[index];           if(htmlText.get('html')){               setHtml('Loading...');               playListItem.bind('begin', beginFunction);           }           else{               setMediaLabel(index);           }       }   };   var disposeFunction = function(){       htmlText.set('html', undefined);       playList.unbind('change', changeFunction, this);       playListItemStopToDispose.unbind('stop', disposeFunction, this);   };   if(playListItemStopToDispose){       playListItemStopToDispose.bind('stop', disposeFunction, this);   }   playList.bind('change', changeFunction, this);   changeFunction(); },
  "existsKey": function(key){    return key in window; },
  "updateVideoCues": function(playList, index){    var playListItem = playList.get('items')[index];   var video = playListItem.get('media');   if(video.get('cues').length == 0)       return;   var player = playListItem.get('player');   var cues = [];   var changeFunction = function(){       if(playList.get('selectedIndex') != index){           video.unbind('cueChange', cueChangeFunction, this);           playList.unbind('change', changeFunction, this);       }   };   var cueChangeFunction = function(event){       var activeCues = event.data.activeCues;       for(var i = 0, count = cues.length; i<count; ++i){           var cue = cues[i];           if(activeCues.indexOf(cue) == -1 && (cue.get('startTime') > player.get('currentTime') || cue.get('endTime') < player.get('currentTime')+0.5)){               cue.trigger('end');           }       }       cues = activeCues;   };   video.bind('cueChange', cueChangeFunction, this);   playList.bind('change', changeFunction, this); },
  "isCardboardViewMode": function(){    var players = this.getByClassName('PanoramaPlayer');   return players.length > 0 && players[0].get('viewMode') == 'cardboard'; },
  "showPopupPanoramaVideoOverlay": function(popupPanoramaOverlay, closeButtonProperties){    var self = this;   var showEndFunction = function() {       popupPanoramaOverlay.unbind('showEnd', showEndFunction);       closeButton.bind('click', hideFunction, this);       setCloseButtonPosition();       closeButton.set('visible', true);   };   var endFunction = function() {       if(!popupPanoramaOverlay.get('loop'))           hideFunction();   };   var hideFunction = function() {       if(!self.isCardboardViewMode())           popupPanoramaOverlay.set('visible', false);       closeButton.set('visible', false);       closeButton.unbind('click', hideFunction, this);       popupPanoramaOverlay.unbind('end', endFunction, self);       self.resumePlayers(playersPaused, true);       self.resumeGlobalAudios();   };   var setCloseButtonPosition = function() {       var right = 10;       var top = 10;       closeButton.set('right', right);       closeButton.set('top', top);   };   var closeButton = this.closeButtonPopupPanorama;   if(closeButtonProperties){       for(var key in closeButtonProperties){           closeButton.set(key, closeButtonProperties[key]);       }   }   var playersPaused = this.pauseCurrentPlayers(true);   this.pauseGlobalAudios();   popupPanoramaOverlay.bind('end', endFunction, this, true);   popupPanoramaOverlay.bind('showEnd', showEndFunction, this, true);   popupPanoramaOverlay.set('visible', true); },
  "shareGoogle": function(url){    window.open('https://plus.google.com/share?url=' + url, '_blank'); },
  "playAudioList": function(audios){    if(audios.length == 0) return;   var currentAudioCount = -1;   var currentAudio;   var playGlobalAudioFunction = this.playGlobalAudio;   var playNext = function(){       if(++currentAudioCount >= audios.length)           currentAudioCount = 0;       currentAudio = audios[currentAudioCount];       playGlobalAudioFunction(currentAudio, playNext);   };   playNext(); },
  "showPopupMedia": function(w, media, playList, popupMaxWidth, popupMaxHeight, autoCloseWhenFinished, containsAudio){    var self = this;   var closeFunction = function(){       this.resumePlayers(playersPaused, !containsAudio);       if(isVideo) {           this.unbind('resize', resizeFunction, this);       }       w.unbind('close', closeFunction, this);   };   var endFunction = function(){       w.hide();   };   var resizeFunction = function(){       var parentWidth = self.get('actualWidth');       var parentHeight = self.get('actualHeight');       var mediaWidth = media.get('width');       var mediaHeight = media.get('height');       var popupMaxWidthNumber = parseFloat(popupMaxWidth) / 100;       var popupMaxHeightNumber = parseFloat(popupMaxHeight) / 100;       var windowWidth = popupMaxWidthNumber * parentWidth;       var windowHeight = popupMaxHeightNumber * parentHeight;       var footerHeight = w.get('footerHeight');       var headerHeight = w.get('headerHeight');       if(!headerHeight) {           var closeButtonHeight = w.get('closeButtonIconHeight') + w.get('closeButtonPaddingTop') + w.get('closeButtonPaddingBottom');           var titleHeight = w.get('titleFontSize') + w.get('titlePaddingTop') + w.get('titlePaddingBottom');           headerHeight = closeButtonHeight > titleHeight ? closeButtonHeight : titleHeight;           headerHeight += w.get('headerPaddingTop') + w.get('headerPaddingBottom');       }       if(!footerHeight) {           footerHeight = 0;       }       var contentWindowWidth = windowWidth - w.get('bodyPaddingLeft') - w.get('bodyPaddingRight') - w.get('paddingLeft') - w.get('paddingRight');       var contentWindowHeight = windowHeight - headerHeight - footerHeight - w.get('bodyPaddingTop') - w.get('bodyPaddingBottom') - w.get('paddingTop') - w.get('paddingBottom');       var parentAspectRatio = contentWindowWidth / contentWindowHeight;       var mediaAspectRatio = mediaWidth / mediaHeight;       if(parentAspectRatio > mediaAspectRatio) {           windowWidth = contentWindowHeight * mediaAspectRatio + w.get('bodyPaddingLeft') + w.get('bodyPaddingRight') + w.get('paddingLeft') + w.get('paddingRight');       }       else {           windowHeight = contentWindowWidth / mediaAspectRatio + headerHeight + footerHeight + w.get('bodyPaddingTop') + w.get('bodyPaddingBottom') + w.get('paddingTop') + w.get('paddingBottom');       }       if(windowWidth > parentWidth * popupMaxWidthNumber) {           windowWidth = parentWidth * popupMaxWidthNumber;       }       if(windowHeight > parentHeight * popupMaxHeightNumber) {           windowHeight = parentHeight * popupMaxHeightNumber;       }       w.set('width', windowWidth);       w.set('height', windowHeight);       w.set('x', (parentWidth - w.get('actualWidth')) * 0.5);       w.set('y', (parentHeight - w.get('actualHeight')) * 0.5);   };   if(autoCloseWhenFinished){       this.executeFunctionWhenChange(playList, 0, endFunction);   }   var isVideo = media.get('class') == 'Video';   if(isVideo){       this.bind('resize', resizeFunction, this);       resizeFunction();   }   else {       w.set('width', popupMaxWidth);       w.set('height', popupMaxHeight);   }   var playersPaused = this.pauseCurrentPlayers(!containsAudio);   w.bind('close', closeFunction, this);   w.show(this, true); },
  "resumePlayers": function(players, onlyResumeCameraIfPanorama){    for(var i = 0; i<players.length; ++i){       var player = players[i];       if(onlyResumeCameraIfPanorama && player.get('class') == 'PanoramaPlayer' && typeof player.get('video') === 'undefined'){           player.resumeCamera();       }       else{           player.play();       }   } },
  "syncPlaylists": function(playLists){    var changeFunction = function(event){       var playListDispatched = event.source;       var selectedIndex = playListDispatched.get('selectedIndex');       if(selectedIndex < 0)           return;       var media = playListDispatched.get('items')[selectedIndex].get('media');       for(var i = 0, count = playLists.length; i<count; ++i){           var playList = playLists[i];           if(playList != playListDispatched){               var items = playList.get('items');               for(var j = 0, countJ = items.length; j<countJ; ++j){                   if(items[j].get('media') == media){                       if(playList.get('selectedIndex') != j){                           playList.set('selectedIndex', j);                       }                       break;                   }               }           }       }   };   for(var i = 0, count = playLists.length; i<count; ++i){       playLists[i].bind('change', changeFunction, this);   } },
  "pauseGlobalAudios": function(caller){    var audios = window.currentGlobalAudios;   window.currentGlobalAudiosActionCaller = caller;   if(!audios) return;   for(var i = 0, count = audios.length; i<count; i++){       audios[i].pause();   } },
  "playGlobalAudio": function(audio, endCallback){    var endFunction = function(){       audio.unbind('end', endFunction, this);       this.stopGlobalAudio(audio);       if(endCallback)           endCallback();   };   var audios = window.currentGlobalAudios;   if(!audios){       audios = window.currentGlobalAudios = [audio];   }   else if(audios.indexOf(audio) == -1){       audios.push(audio);   }   audio.bind('end', endFunction, this);   audio.play(); },
  "pauseGlobalAudiosWhilePlayItem": function(playList, index, caller){    var audios = window.currentGlobalAudios;   if(!audios) return;   var resumeFunction = this.resumeGlobalAudios;   var endFunction = function(){       if(playlist.get('selectedIndex') != index) {           resumeFunction(caller);       }   };   this.pauseGlobalAudios(caller);   this.executeFunctionWhenChange(playList, index, endFunction, endFunction); },
  "fixTogglePlayPauseButton": function(player){    var state = player.get('state');   var button = player.get('buttonPlayPause');   if(typeof button !== 'undefined' && player.get('state') == 'playing'){       button.set('pressed', true);   } },
  "unregisterKey": function(key){    delete window[key]; },
  "stopGlobalAudio": function(audio){    var audios = window.currentGlobalAudios;   if(audios){       var index = audios.indexOf(audio);       if(index != -1){           audios.splice(index, 1);       }   }   audio.stop(); },
  "getKey": function(key){    return window[key]; },
  "startPanoramaWithCamera": function(panorama, camera){    var playLists = this.getByClassName('PlayList');   if(playLists.length == 0)       return;    var restoreItems = [];   for(var i = 0, count = playLists.length; i<count; ++i){       var playList = playLists[i];       var items = playList.get('items');       for(var j = 0, countJ = items.length; j<countJ; ++j){           var item = items[j];           if(item.get('media') == panorama && item.get('class') == 'PanoramaPlayListItem'){               restoreItems.push({camera: item.get('camera'), item: item});               item.set('camera', camera);           }       }   }   if(restoreItems.length > 0) {       var restoreCameraOnStop = function(){           for (var i = 0; i < restoreItems.length; i++) {               restoreItems[i].item.set('camera', restoreItems[i].camera);           }           restoreItems[0].item.unbind('stop', restoreCameraOnStop, this);       };       restoreItems[0].item.bind('stop', restoreCameraOnStop, this);   } },
  "shareFacebook": function(url){    window.open('https://www.facebook.com/sharer/sharer.php?u=' + url, '_blank'); }
 },
 "mouseWheelEnabled": true,
 "paddingLeft": 0,
 "scrollBarMargin": 2,
 "borderRadius": 0,
 "verticalAlign": "top",
 "scrollBarWidth": 10,
 "id": "rootPlayer",
 "overflow": "visible",
 "height": "100%",
 "contentOpaque": false,
 "minHeight": 20,
 "width": "100%",
 "layout": "absolute",
 "paddingBottom": 0
})