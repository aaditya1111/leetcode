package leetcode.algorithms;

import java.util.*;

/**
 * Description: 1245. Tree Diameter
 *
 * @author Baltan
 * @date 2019-11-04 09:07
 */
public class TreeDiameter {
    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {0, 2}};
        System.out.println(treeDiameter(edges1));

        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}, {1, 4}, {4, 5}};
        System.out.println(treeDiameter(edges2));

        int[][] edges3 =
                {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {4, 5}, {4, 6}, {2, 7}, {1, 8}, {1, 9}, {6, 10}, {7, 11},
                        {2, 12}, {8, 13}, {9, 14}, {10, 15}, {14, 16}, {16, 17}, {8, 18}, {2, 19}, {0, 20},
                        {5, 21}, {17, 22}, {19, 23}, {9, 24}, {22, 25}, {6, 26}, {18, 27}, {12, 28}, {17, 29},
                        {16, 30}, {14, 31}, {1, 32}, {29, 33}, {13, 34}, {18, 35}, {23, 36}, {31, 37},
                        {19, 38}, {14, 39}, {34, 40}, {7, 41}, {31, 42}, {41, 43}, {25, 44}, {37, 45},
                        {32, 46}, {11, 47}, {25, 48}, {41, 49}, {25, 50}, {4, 51}, {16, 52}, {14, 53},
                        {0, 54}, {24, 55}, {27, 56}, {41, 57}, {21, 58}, {4, 59}, {44, 60}, {6, 61}, {44, 62},
                        {55, 63}, {29, 64}, {20, 65}, {29, 66}, {2, 67}, {27, 68}, {56, 69}, {0, 70},
                        {70, 71}, {28, 72}, {72, 73}, {68, 74}, {25, 75}, {66, 76}, {4, 77}, {67, 78},
                        {52, 79}, {37, 80}, {68, 81}, {64, 82}, {77, 83}, {37, 84}, {4, 85}, {78, 86},
                        {86, 87}, {13, 88}, {9, 89}, {39, 90}, {24, 91}, {53, 92}, {5, 93}, {33, 94},
                        {61, 95}, {73, 96}, {20, 97}, {89, 98}, {21, 99}, {17, 100}, {71, 101}, {1, 102},
                        {56, 103}, {7, 104}, {48, 105}, {21, 106}, {29, 107}, {23, 108}, {57, 109}, {11, 110},
                        {49, 111}, {18, 112}, {49, 113}, {95, 114}, {104, 115}, {59, 116}, {93, 117},
                        {101, 118}, {66, 119}, {49, 120}, {51, 121}, {70, 122}, {95, 123}, {88, 124},
                        {77, 125}, {0, 126}, {58, 127}, {8, 128}, {71, 129}, {18, 130}, {92, 131}, {75, 132},
                        {47, 133}, {85, 134}, {92, 135}, {43, 136}, {19, 137}, {85, 138}, {18, 139},
                        {99, 140}, {13, 141}, {118, 142}, {1, 143}, {129, 144}, {29, 145}, {142, 146},
                        {96, 147}, {38, 148}, {128, 149}, {2, 150}, {118, 151}, {126, 152}, {38, 153},
                        {87, 154}, {8, 155}, {88, 156}, {47, 157}, {94, 158}, {82, 159}, {119, 160},
                        {28, 161}, {8, 162}, {127, 163}, {51, 164}, {10, 165}, {46, 166}, {79, 167},
                        {17, 168}, {81, 169}, {27, 170}, {29, 171}, {23, 172}, {77, 173}, {1, 174},
                        {149, 175}, {33, 176}, {98, 177}, {63, 178}, {70, 179}, {35, 180}, {82, 181},
                        {124, 182}, {33, 183}, {76, 184}, {160, 185}, {101, 186}, {102, 187}, {125, 188},
                        {128, 189}, {163, 190}, {182, 191}, {56, 192}, {68, 193}, {105, 194}, {19, 195},
                        {97, 196}, {176, 197}, {17, 198}, {153, 199}, {168, 200}, {143, 201}, {87, 202},
                        {8, 203}, {17, 204}, {167, 205}, {101, 206}, {160, 207}, {2, 208}, {160, 209},
                        {75, 210}, {29, 211}, {133, 212}, {147, 213}, {59, 214}, {94, 215}, {212, 216},
                        {147, 217}, {155, 218}, {108, 219}, {219, 220}, {89, 221}, {4, 222}, {75, 223},
                        {9, 224}, {45, 225}, {142, 226}, {142, 227}, {131, 228}, {92, 229}, {198, 230},
                        {204, 231}, {32, 232}, {68, 233}, {223, 234}, {175, 235}, {51, 236}, {225, 237},
                        {50, 238}, {3, 239}, {181, 240}, {164, 241}, {240, 242}, {233, 243}, {44, 244},
                        {162, 245}, {73, 246}, {38, 247}, {141, 248}, {158, 249}, {35, 250}, {14, 251},
                        {14, 252}, {82, 253}, {183, 254}, {157, 255}, {45, 256}, {187, 257}, {201, 258},
                        {240, 259}, {159, 260}, {140, 261}, {209, 262}, {174, 263}, {193, 264}, {99, 265},
                        {230, 266}, {88, 267}, {23, 268}, {268, 269}, {8, 270}, {16, 271}, {89, 272},
                        {29, 273}, {88, 274}, {143, 275}, {228, 276}, {26, 277}, {93, 278}, {245, 279},
                        {95, 280}, {199, 281}, {93, 282}, {263, 283}, {143, 284}, {270, 285}, {20, 286},
                        {67, 287}, {129, 288}, {214, 289}, {25, 290}, {78, 291}, {256, 292}, {188, 293},
                        {98, 294}, {2, 295}, {196, 296}, {33, 297}, {185, 298}, {208, 299}, {241, 300},
                        {223, 301}, {170, 302}, {211, 303}, {126, 304}, {43, 305}, {70, 306}, {285, 307},
                        {62, 308}, {19, 309}, {98, 310}, {16, 311}, {34, 312}, {93, 313}, {246, 314},
                        {122, 315}, {49, 316}, {149, 317}, {26, 318}, {17, 319}, {295, 320}, {32, 321},
                        {263, 322}, {130, 323}, {190, 324}, {306, 325}, {193, 326}, {305, 327}, {8, 328},
                        {155, 329}, {134, 330}, {90, 331}, {123, 332}, {179, 333}, {50, 334}, {296, 335},
                        {164, 336}, {37, 337}, {243, 338}, {132, 339}, {189, 340}, {48, 341}, {224, 342},
                        {54, 343}, {223, 344}, {333, 345}, {204, 346}, {152, 347}, {276, 348}, {244, 349},
                        {234, 350}, {273, 351}, {29, 352}, {116, 353}, {22, 354}, {15, 355}, {10, 356},
                        {340, 357}, {152, 358}, {11, 359}, {285, 360}, {264, 361}, {257, 362}, {221, 363},
                        {263, 364}, {177, 365}, {124, 366}, {204, 367}, {315, 368}, {120, 369}, {333, 370},
                        {189, 371}, {17, 372}, {264, 373}, {353, 374}, {355, 375}, {284, 376}, {165, 377},
                        {78, 378}, {372, 379}, {49, 380}, {334, 381}, {164, 382}, {338, 383}, {102, 384},
                        {165, 385}, {251, 386}, {325, 387}, {235, 388}, {128, 389}, {42, 390}, {36, 391},
                        {188, 392}, {79, 393}, {93, 394}, {41, 395}, {48, 396}, {275, 397}, {194, 398},
                        {60, 399}, {276, 400}, {26, 401}, {175, 402}, {157, 403}, {79, 404}, {373, 405},
                        {360, 406}, {109, 407}, {35, 408}, {230, 409}, {382, 410}, {195, 411}, {262, 412},
                        {201, 413}, {368, 414}, {351, 415}, {63, 416}, {241, 417}, {187, 418}, {12, 419},
                        {81, 420}, {84, 421}, {255, 422}, {124, 423}, {147, 424}, {385, 425}, {307, 426},
                        {231, 427}, {407, 428}, {74, 429}, {74, 430}, {1, 431}, {142, 432}, {214, 433},
                        {45, 434}, {214, 435}, {141, 436}, {299, 437}, {102, 438}, {19, 439}, {52, 440},
                        {291, 441}, {156, 442}, {365, 443}, {357, 444}, {93, 445}, {316, 446}, {446, 447},
                        {169, 448}, {225, 449}, {79, 450}, {83, 451}, {324, 452}, {8, 453}, {241, 454},
                        {433, 455}, {196, 456}, {182, 457}, {143, 458}, {427, 459}, {22, 460}, {305, 461},
                        {222, 462}, {434, 463}, {105, 464}, {53, 465}, {393, 466}, {445, 467}, {65, 468},
                        {331, 469}, {13, 470}, {373, 471}, {197, 472}, {402, 473}, {344, 474}, {245, 475},
                        {146, 476}, {83, 477}, {354, 478}, {351, 479}, {261, 480}, {316, 481}, {273, 482},
                        {365, 483}, {361, 484}, {397, 485}, {333, 486}, {191, 487}, {463, 488}, {484, 489},
                        {151, 490}, {9, 491}, {211, 492}, {322, 493}, {441, 494}, {202, 495}, {406, 496},
                        {299, 497}, {49, 498}, {324, 499}, {342, 500}, {367, 501}, {95, 502}, {120, 503},
                        {232, 504}, {270, 505}, {128, 506}, {372, 507}, {503, 508}, {355, 509}, {458, 510},
                        {6, 511}, {434, 512}, {18, 513}, {199, 514}, {314, 515}, {34, 516}, {274, 517},
                        {236, 518}, {104, 519}, {434, 520}, {257, 521}, {68, 522}, {312, 523}, {473, 524},
                        {213, 525}, {175, 526}, {193, 527}, {372, 528}, {425, 529}, {407, 530}, {391, 531},
                        {61, 532}, {382, 533}, {367, 534}, {143, 535}, {316, 536}, {45, 537}, {20, 538},
                        {20, 539}, {102, 540}, {309, 541}, {243, 542}, {104, 543}, {529, 544}, {433, 545},
                        {182, 546}, {442, 547}, {349, 548}, {251, 549}, {490, 550}, {244, 551}, {383, 552},
                        {17, 553}, {145, 554}, {457, 555}, {29, 556}, {422, 557}, {535, 558}, {85, 559},
                        {115, 560}, {69, 561}, {515, 562}, {122, 563}, {100, 564}, {212, 565}, {307, 566},
                        {364, 567}, {409, 568}, {13, 569}, {495, 570}, {210, 571}, {470, 572}, {182, 573},
                        {323, 574}, {266, 575}, {512, 576}, {537, 577}, {266, 578}, {443, 579}, {38, 580},
                        {218, 581}, {92, 582}, {320, 583}, {237, 584}, {199, 585}, {372, 586}, {558, 587},
                        {417, 588}, {495, 589}, {300, 590}, {207, 591}, {243, 592}, {177, 593}, {140, 594},
                        {39, 595}, {153, 596}, {284, 597}, {356, 598}, {385, 599}, {456, 600}, {328, 601},
                        {261, 602}, {193, 603}, {43, 604}, {135, 605}, {332, 606}, {510, 607}, {353, 608},
                        {134, 609}, {48, 610}, {407, 611}, {7, 612}, {373, 613}, {551, 614}, {585, 615},
                        {300, 616}, {252, 617}, {535, 618}, {496, 619}, {471, 620}, {308, 621}, {64, 622},
                        {68, 623}, {84, 624}, {22, 625}, {518, 626}, {219, 627}, {415, 628}, {552, 629},
                        {615, 630}, {447, 631}, {536, 632}, {620, 633}, {379, 634}, {95, 635}, {457, 636},
                        {525, 637}, {551, 638}, {623, 639}, {531, 640}, {218, 641}, {607, 642}, {167, 643},
                        {242, 644}, {489, 645}, {605, 646}, {170, 647}, {180, 648}, {363, 649}, {223, 650},
                        {424, 651}, {494, 652}, {358, 653}, {115, 654}, {564, 655}, {7, 656}, {260, 657},
                        {197, 658}, {596, 659}, {379, 660}, {211, 661}, {376, 662}, {570, 663}, {649, 664},
                        {443, 665}, {415, 666}, {36, 667}, {433, 668}, {344, 669}, {303, 670}, {564, 671},
                        {343, 672}, {426, 673}, {39, 674}, {158, 675}, {98, 676}, {345, 677}, {384, 678},
                        {168, 679}, {422, 680}, {222, 681}, {313, 682}, {481, 683}, {526, 684}, {22, 685},
                        {316, 686}, {641, 687}, {395, 688}, {271, 689}, {324, 690}, {340, 691}, {675, 692},
                        {551, 693}, {97, 694}, {302, 695}, {235, 696}, {520, 697}, {389, 698}, {465, 699},
                        {362, 700}, {190, 701}, {72, 702}, {564, 703}, {491, 704}, {579, 705}, {482, 706},
                        {421, 707}, {467, 708}, {93, 709}, {694, 710}, {401, 711}, {385, 712}, {230, 713},
                        {23, 714}, {76, 715}, {312, 716}, {634, 717}, {273, 718}, {19, 719}, {416, 720},
                        {461, 721}, {602, 722}, {142, 723}, {69, 724}, {717, 725}, {648, 726}, {85, 727},
                        {455, 728}, {489, 729}, {195, 730}, {30, 731}, {708, 732}, {263, 733}, {362, 734},
                        {266, 735}, {177, 736}, {126, 737}, {319, 738}, {371, 739}, {290, 740}, {335, 741},
                        {520, 742}, {35, 743}, {501, 744}, {164, 745}, {373, 746}, {620, 747}, {403, 748},
                        {610, 749}, {53, 750}, {415, 751}, {359, 752}, {666, 753}, {483, 754}, {18, 755},
                        {652, 756}, {698, 757}, {377, 758}, {200, 759}, {252, 760}, {423, 761}, {59, 762},
                        {51, 763}, {48, 764}, {478, 765}, {628, 766}, {458, 767}, {392, 768}, {82, 769},
                        {359, 770}, {65, 771}, {194, 772}, {281, 773}, {93, 774}, {371, 775}, {626, 776},
                        {760, 777}, {388, 778}, {130, 779}, {351, 780}, {353, 781}, {747, 782}, {354, 783},
                        {270, 784}, {207, 785}, {670, 786}, {647, 787}, {309, 788}, {510, 789}, {340, 790},
                        {729, 791}, {322, 792}, {580, 793}, {103, 794}, {323, 795}, {80, 796}, {90, 797},
                        {21, 798}, {275, 799}, {753, 800}, {276, 801}, {338, 802}, {3, 803}, {531, 804},
                        {432, 805}, {89, 806}, {462, 807}, {329, 808}, {363, 809}, {727, 810}, {736, 811},
                        {488, 812}, {305, 813}, {720, 814}, {131, 815}, {791, 816}, {68, 817}, {357, 818},
                        {509, 819}, {371, 820}, {41, 821}, {711, 822}, {145, 823}, {785, 824}, {203, 825},
                        {310, 826}, {438, 827}, {686, 828}, {81, 829}, {387, 830}, {341, 831}, {362, 832},
                        {1, 833}, {670, 834}, {405, 835}, {697, 836}, {59, 837}, {93, 838}, {61, 839},
                        {57, 840}, {158, 841}, {782, 842}, {220, 843}, {379, 844}, {697, 845}, {247, 846},
                        {439, 847}, {338, 848}, {143, 849}, {660, 850}, {199, 851}, {665, 852}, {760, 853},
                        {419, 854}, {765, 855}, {673, 856}, {198, 857}, {160, 858}, {217, 859}, {286, 860},
                        {646, 861}, {688, 862}, {439, 863}, {149, 864}, {351, 865}, {738, 866}, {1, 867},
                        {256, 868}, {401, 869}, {861, 870}, {598, 871}, {450, 872}, {544, 873}, {601, 874},
                        {108, 875}, {307, 876}, {830, 877}, {537, 878}, {167, 879}, {877, 880}, {78, 881},
                        {780, 882}, {791, 883}, {230, 884}, {749, 885}, {495, 886}, {650, 887}, {179, 888},
                        {363, 889}, {854, 890}, {288, 891}, {538, 892}, {607, 893}, {361, 894}, {125, 895},
                        {401, 896}, {721, 897}, {514, 898}, {607, 899}, {477, 900}, {705, 901}, {265, 902},
                        {499, 903}, {709, 904}, {31, 905}, {576, 906}, {419, 907}, {608, 908}, {351, 909},
                        {814, 910}, {217, 911}, {522, 912}, {909, 913}, {882, 914}, {350, 915}, {447, 916},
                        {852, 917}, {595, 918}, {55, 919}, {510, 920}, {282, 921}, {317, 922}, {0, 923},
                        {324, 924}, {601, 925}, {391, 926}, {822, 927}, {319, 928}, {466, 929}, {853, 930},
                        {832, 931}, {539, 932}, {261, 933}, {41, 934}, {693, 935}, {184, 936}, {87, 937},
                        {555, 938}, {560, 939}, {146, 940}, {278, 941}, {767, 942}, {779, 943}, {56, 944},
                        {895, 945}, {789, 946}, {337, 947}, {314, 948}, {860, 949}, {695, 950}, {897, 951},
                        {171, 952}, {146, 953}, {537, 954}, {43, 955}, {555, 956}, {81, 957}, {474, 958},
                        {543, 959}, {253, 960}, {904, 961}, {786, 962}, {837, 963}, {338, 964}, {411, 965},
                        {333, 966}, {678, 967}, {173, 968}, {67, 969}, {654, 970}, {829, 971}, {822, 972},
                        {541, 973}, {641, 974}, {164, 975}, {775, 976}, {490, 977}, {401, 978}, {563, 979},
                        {938, 980}, {484, 981}, {722, 982}, {256, 983}, {472, 984}, {489, 985}, {340, 986},
                        {729, 987}, {595, 988}, {443, 989}, {371, 990}, {178, 991}, {461, 992}, {99, 993},
                        {216, 994}, {786, 995}, {239, 996}, {728, 997}, {745, 998}, {327, 999}, {403, 1000},
                        {649, 1001}, {961, 1002}, {982, 1003}, {155, 1004}, {865, 1005}, {80, 1006},
                        {985, 1007}, {872, 1008}, {998, 1009}, {442, 1010}, {323, 1011}, {527, 1012},
                        {954, 1013}, {13, 1014}, {92, 1015}, {527, 1016}, {838, 1017}, {68, 1018},
                        {786, 1019}, {768, 1020}, {617, 1021}, {842, 1022}, {287, 1023}, {942, 1024},
                        {870, 1025}, {576, 1026}, {981, 1027}, {405, 1028}, {815, 1029}, {656, 1030},
                        {713, 1031}, {467, 1032}, {146, 1033}, {299, 1034}, {740, 1035}, {233, 1036},
                        {260, 1037}, {616, 1038}, {182, 1039}, {729, 1040}, {731, 1041}, {54, 1042},
                        {931, 1043}, {737, 1044}, {734, 1045}, {262, 1046}, {194, 1047}, {543, 1048},
                        {434, 1049}, {82, 1050}, {825, 1051}, {779, 1052}, {577, 1053}, {131, 1054},
                        {983, 1055}, {577, 1056}, {748, 1057}, {561, 1058}, {789, 1059}, {1036, 1060},
                        {158, 1061}, {708, 1062}, {282, 1063}, {204, 1064}, {918, 1065}, {539, 1066},
                        {880, 1067}, {1000, 1068}, {525, 1069}, {864, 1070}, {220, 1071}, {1068, 1072},
                        {134, 1073}, {954, 1074}, {303, 1075}, {369, 1076}, {504, 1077}, {251, 1078},
                        {981, 1079}, {976, 1080}, {790, 1081}, {767, 1082}, {946, 1083}, {115, 1084},
                        {795, 1085}, {555, 1086}, {881, 1087}, {548, 1088}, {71, 1089}, {976, 1090},
                        {878, 1091}, {1004, 1092}, {394, 1093}, {890, 1094}, {153, 1095}, {406, 1096},
                        {175, 1097}, {665, 1098}, {61, 1099}, {821, 1100}, {292, 1101}, {262, 1102},
                        {730, 1103}, {145, 1104}, {582, 1105}, {447, 1106}, {993, 1107}, {122, 1108},
                        {973, 1109}, {21, 1110}, {92, 1111}, {851, 1112}, {1020, 1113}, {927, 1114},
                        {404, 1115}, {620, 1116}, {24, 1117}, {67, 1118}, {74, 1119}, {665, 1120},
                        {365, 1121}, {571, 1122}, {1091, 1123}, {318, 1124}, {768, 1125}, {96, 1126},
                        {37, 1127}, {657, 1128}, {668, 1129}, {999, 1130}, {409, 1131}, {346, 1132},
                        {472, 1133}, {667, 1134}, {411, 1135}, {134, 1136}, {635, 1137}, {621, 1138},
                        {989, 1139}, {944, 1140}, {628, 1141}, {927, 1142}, {869, 1143}, {455, 1144},
                        {756, 1145}, {363, 1146}, {634, 1147}, {935, 1148}, {998, 1149}, {42, 1150},
                        {599, 1151}, {607, 1152}, {82, 1153}, {628, 1154}, {961, 1155}, {24, 1156},
                        {1156, 1157}, {498, 1158}, {650, 1159}, {301, 1160}, {969, 1161}, {660, 1162},
                        {957, 1163}, {1061, 1164}, {797, 1165}, {62, 1166}, {1094, 1167}, {749, 1168},
                        {989, 1169}, {452, 1170}, {428, 1171}, {1167, 1172}, {1002, 1173}, {977, 1174},
                        {928, 1175}, {28, 1176}, {272, 1177}, {770, 1178}, {483, 1179}, {403, 1180},
                        {614, 1181}, {377, 1182}, {953, 1183}, {407, 1184}, {448, 1185}, {1120, 1186},
                        {815, 1187}, {604, 1188}, {634, 1189}, {459, 1190}, {688, 1191}, {571, 1192},
                        {85, 1193}, {55, 1194}, {664, 1195}, {742, 1196}, {238, 1197}, {308, 1198},
                        {447, 1199}, {261, 1200}, {838, 1201}, {153, 1202}, {218, 1203}, {632, 1204},
                        {474, 1205}, {1063, 1206}, {586, 1207}, {690, 1208}, {832, 1209}, {138, 1210},
                        {474, 1211}, {223, 1212}, {1121, 1213}, {1151, 1214}, {403, 1215}, {1055, 1216},
                        {937, 1217}, {463, 1218}, {991, 1219}, {690, 1220}, {505, 1221}, {416, 1222},
                        {146, 1223}, {546, 1224}, {62, 1225}, {1222, 1226}, {718, 1227}, {223, 1228},
                        {762, 1229}, {920, 1230}, {257, 1231}, {1214, 1232}, {1160, 1233}, {609, 1234},
                        {832, 1235}, {870, 1236}, {73, 1237}, {634, 1238}, {904, 1239}, {490, 1240},
                        {450, 1241}, {399, 1242}, {73, 1243}, {654, 1244}, {643, 1245}, {737, 1246},
                        {4, 1247}, {1081, 1248}, {571, 1249}, {254, 1250}, {887, 1251}, {164, 1252},
                        {1022, 1253}, {754, 1254}, {1023, 1255}, {970, 1256}, {432, 1257}, {254, 1258},
                        {769, 1259}, {826, 1260}, {254, 1261}, {613, 1262}, {6, 1263}, {649, 1264},
                        {1165, 1265}, {592, 1266}, {856, 1267}, {165, 1268}, {606, 1269}, {905, 1270},
                        {548, 1271}, {1051, 1272}, {650, 1273}, {159, 1274}, {1248, 1275}, {641, 1276},
                        {733, 1277}, {525, 1278}, {957, 1279}, {804, 1280}, {411, 1281}, {1068, 1282},
                        {131, 1283}, {1068, 1284}, {437, 1285}, {1131, 1286}, {1095, 1287}, {723, 1288},
                        {30, 1289}, {645, 1290}, {613, 1291}, {714, 1292}, {576, 1293}, {483, 1294},
                        {595, 1295}, {548, 1296}, {545, 1297}, {205, 1298}, {486, 1299}, {1173, 1300},
                        {762, 1301}, {730, 1302}, {1025, 1303}, {1301, 1304}, {155, 1305}, {17, 1306},
                        {1186, 1307}, {562, 1308}, {1298, 1309}, {370, 1310}, {918, 1311}, {577, 1312},
                        {671, 1313}, {613, 1314}, {451, 1315}, {921, 1316}, {360, 1317}, {501, 1318},
                        {1079, 1319}, {486, 1320}, {432, 1321}, {515, 1322}, {318, 1323}, {1104, 1324},
                        {801, 1325}, {491, 1326}, {1027, 1327}, {769, 1328}, {331, 1329}, {164, 1330},
                        {67, 1331}, {1055, 1332}, {196, 1333}, {907, 1334}, {173, 1335}, {1160, 1336},
                        {952, 1337}, {274, 1338}, {988, 1339}, {1276, 1340}, {111, 1341}, {420, 1342},
                        {698, 1343}, {1326, 1344}, {1116, 1345}, {955, 1346}, {1227, 1347}, {447, 1348},
                        {1071, 1349}, {782, 1350}, {1256, 1351}, {874, 1352}, {563, 1353}, {201, 1354},
                        {12, 1355}, {374, 1356}, {608, 1357}, {784, 1358}, {419, 1359}, {32, 1360},
                        {331, 1361}, {1131, 1362}, {793, 1363}, {454, 1364}, {857, 1365}, {1107, 1366},
                        {967, 1367}, {700, 1368}, {1225, 1369}, {1310, 1370}, {35, 1371}, {599, 1372},
                        {750, 1373}, {1205, 1374}, {525, 1375}, {1261, 1376}, {1183, 1377}, {629, 1378},
                        {717, 1379}, {127, 1380}, {902, 1381}, {503, 1382}, {314, 1383}, {103, 1384},
                        {169, 1385}, {212, 1386}, {1282, 1387}, {230, 1388}, {1034, 1389}, {1240, 1390},
                        {292, 1391}, {495, 1392}, {331, 1393}, {1080, 1394}, {446, 1395}, {514, 1396},
                        {771, 1397}, {366, 1398}, {1083, 1399}, {914, 1400}, {102, 1401}, {990, 1402},
                        {540, 1403}, {916, 1404}, {1213, 1405}, {602, 1406}, {510, 1407}, {1405, 1408},
                        {506, 1409}, {784, 1410}, {1176, 1411}, {232, 1412}, {361, 1413}, {7, 1414},
                        {1089, 1415}, {1166, 1416}, {96, 1417}, {596, 1418}, {313, 1419}, {1215, 1420},
                        {1071, 1421}, {37, 1422}, {250, 1423}, {32, 1424}, {29, 1425}, {153, 1426},
                        {448, 1427}, {359, 1428}, {441, 1429}, {1035, 1430}, {995, 1431}, {465, 1432},
                        {1019, 1433}, {565, 1434}, {973, 1435}, {1185, 1436}, {367, 1437}, {418, 1438},
                        {722, 1439}, {319, 1440}, {543, 1441}, {390, 1442}, {322, 1443}, {1338, 1444},
                        {532, 1445}, {116, 1446}, {563, 1447}, {837, 1448}, {916, 1449}, {1115, 1450},
                        {1300, 1451}, {1106, 1452}, {1105, 1453}, {240, 1454}, {624, 1455}, {786, 1456},
                        {1045, 1457}, {350, 1458}, {446, 1459}, {82, 1460}, {530, 1461}, {105, 1462},
                        {1153, 1463}, {306, 1464}, {544, 1465}, {1459, 1466}, {250, 1467}, {1072, 1468},
                        {1442, 1469}, {255, 1470}, {1076, 1471}, {849, 1472}, {388, 1473}, {833, 1474},
                        {298, 1475}, {345, 1476}, {160, 1477}, {1415, 1478}, {312, 1479}, {294, 1480},
                        {857, 1481}, {986, 1482}, {974, 1483}, {233, 1484}, {649, 1485}, {914, 1486},
                        {1224, 1487}, {1029, 1488}, {541, 1489}, {1038, 1490}, {329, 1491}, {30, 1492},
                        {361, 1493}, {792, 1494}, {1099, 1495}, {963, 1496}, {211, 1497}, {924, 1498},
                        {673, 1499}, {1180, 1500}, {169, 1501}, {1029, 1502}, {823, 1503}, {565, 1504},
                        {910, 1505}, {1056, 1506}, {779, 1507}, {193, 1508}, {92, 1509}, {995, 1510},
                        {184, 1511}, {704, 1512}, {1075, 1513}, {372, 1514}, {822, 1515}, {702, 1516},
                        {289, 1517}, {325, 1518}, {1430, 1519}, {570, 1520}, {1330, 1521}, {9, 1522},
                        {1182, 1523}, {1463, 1524}, {334, 1525}, {1234, 1526}, {648, 1527}, {374, 1528},
                        {977, 1529}, {491, 1530}, {625, 1531}, {1430, 1532}, {84, 1533}, {461, 1534},
                        {116, 1535}, {1258, 1536}, {1483, 1537}, {115, 1538}, {1492, 1539}, {1127, 1540},
                        {710, 1541}, {656, 1542}, {1140, 1543}, {1196, 1544}, {113, 1545}, {513, 1546},
                        {685, 1547}, {72, 1548}, {1489, 1549}, {651, 1550}, {371, 1551}, {559, 1552},
                        {1438, 1553}, {1525, 1554}, {1308, 1555}, {542, 1556}, {820, 1557}, {1204, 1558},
                        {1107, 1559}, {1018, 1560}, {31, 1561}, {766, 1562}, {272, 1563}, {1477, 1564},
                        {1520, 1565}, {524, 1566}, {1290, 1567}, {977, 1568}, {1358, 1569}, {185, 1570},
                        {435, 1571}, {1566, 1572}, {368, 1573}, {276, 1574}, {802, 1575}, {953, 1576},
                        {83, 1577}, {251, 1578}, {1027, 1579}, {39, 1580}, {1093, 1581}, {866, 1582},
                        {629, 1583}, {646, 1584}, {545, 1585}, {1491, 1586}, {1319, 1587}, {1105, 1588},
                        {878, 1589}, {1025, 1590}, {1559, 1591}, {1367, 1592}, {1400, 1593}, {1349, 1594},
                        {147, 1595}, {1273, 1596}, {1135, 1597}, {1332, 1598}, {1281, 1599}, {840, 1600},
                        {955, 1601}, {401, 1602}, {357, 1603}, {1086, 1604}, {265, 1605}, {193, 1606},
                        {874, 1607}, {998, 1608}, {1218, 1609}, {1403, 1610}, {259, 1611}, {1376, 1612},
                        {704, 1613}, {1389, 1614}, {285, 1615}, {895, 1616}, {1402, 1617}, {798, 1618},
                        {223, 1619}, {206, 1620}, {781, 1621}, {1511, 1622}, {563, 1623}, {30, 1624},
                        {125, 1625}, {200, 1626}, {863, 1627}, {58, 1628}, {1490, 1629}, {1100, 1630},
                        {857, 1631}, {273, 1632}, {3, 1633}, {1268, 1634}, {873, 1635}, {788, 1636},
                        {1583, 1637}, {348, 1638}, {311, 1639}, {1518, 1640}, {374, 1641}, {300, 1642},
                        {810, 1643}, {1006, 1644}, {1404, 1645}, {533, 1646}, {1437, 1647}, {904, 1648},
                        {1571, 1649}, {1404, 1650}, {1115, 1651}, {1156, 1652}, {140, 1653}, {1128, 1654},
                        {603, 1655}, {518, 1656}, {1038, 1657}, {753, 1658}, {368, 1659}, {736, 1660},
                        {1537, 1661}, {782, 1662}, {72, 1663}, {1643, 1664}, {766, 1665}, {823, 1666},
                        {1639, 1667}, {851, 1668}, {341, 1669}, {1268, 1670}, {393, 1671}, {414, 1672},
                        {237, 1673}, {940, 1674}, {1662, 1675}, {293, 1676}, {1316, 1677}, {801, 1678},
                        {615, 1679}, {627, 1680}, {975, 1681}, {232, 1682}, {1079, 1683}, {696, 1684},
                        {1404, 1685}, {199, 1686}, {681, 1687}, {1111, 1688}, {232, 1689}, {252, 1690},
                        {1369, 1691}, {44, 1692}, {66, 1693}, {1662, 1694}, {342, 1695}, {1431, 1696},
                        {996, 1697}, {913, 1698}, {1651, 1699}, {503, 1700}, {854, 1701}, {1325, 1702},
                        {296, 1703}, {712, 1704}, {1703, 1705}, {277, 1706}, {405, 1707}, {117, 1708},
                        {281, 1709}, {1433, 1710}, {284, 1711}, {1343, 1712}, {355, 1713}, {380, 1714},
                        {1391, 1715}, {1032, 1716}, {1679, 1717}, {373, 1718}, {434, 1719}, {145, 1720},
                        {1655, 1721}, {474, 1722}, {1244, 1723}, {1685, 1724}, {47, 1725}, {1385, 1726},
                        {559, 1727}, {1363, 1728}, {280, 1729}, {1497, 1730}, {1132, 1731}, {812, 1732},
                        {1668, 1733}, {1576, 1734}, {1624, 1735}, {1155, 1736}, {233, 1737}, {1070, 1738},
                        {1355, 1739}, {1347, 1740}, {1190, 1741}, {675, 1742}, {1400, 1743}, {1004, 1744},
                        {1002, 1745}, {1298, 1746}, {899, 1747}, {418, 1748}, {1666, 1749}, {1414, 1750},
                        {1140, 1751}, {573, 1752}, {1322, 1753}, {1161, 1754}, {89, 1755}, {955, 1756},
                        {1432, 1757}, {1154, 1758}, {231, 1759}, {161, 1760}, {717, 1761}, {1135, 1762},
                        {780, 1763}, {135, 1764}, {667, 1765}, {75, 1766}, {1460, 1767}, {1287, 1768},
                        {855, 1769}, {1188, 1770}, {748, 1771}, {826, 1772}, {354, 1773}, {1496, 1774},
                        {403, 1775}, {1403, 1776}, {1283, 1777}, {542, 1778}, {1076, 1779}, {573, 1780},
                        {1126, 1781}, {1216, 1782}, {1185, 1783}, {441, 1784}, {1153, 1785}, {560, 1786},
                        {1224, 1787}, {1519, 1788}, {302, 1789}, {447, 1790}, {1120, 1791}, {1024, 1792},
                        {380, 1793}, {1667, 1794}, {1581, 1795}, {1430, 1796}, {1435, 1797}, {110, 1798},
                        {124, 1799}, {212, 1800}, {135, 1801}, {745, 1802}, {1608, 1803}, {746, 1804},
                        {892, 1805}, {1096, 1806}, {1017, 1807}, {26, 1808}, {922, 1809}, {770, 1810},
                        {1267, 1811}, {58, 1812}, {173, 1813}, {1720, 1814}, {1331, 1815}, {560, 1816},
                        {1531, 1817}, {1383, 1818}, {1398, 1819}, {131, 1820}, {254, 1821}, {588, 1822},
                        {1779, 1823}, {1137, 1824}, {953, 1825}, {788, 1826}, {383, 1827}, {1599, 1828},
                        {577, 1829}, {1595, 1830}, {1620, 1831}, {363, 1832}, {620, 1833}, {391, 1834},
                        {316, 1835}, {1255, 1836}, {1190, 1837}, {748, 1838}, {1761, 1839}, {1083, 1840},
                        {153, 1841}, {1432, 1842}, {1824, 1843}, {483, 1844}, {1422, 1845}, {1845, 1846},
                        {1342, 1847}, {591, 1848}, {120, 1849}, {1210, 1850}, {782, 1851}, {541, 1852},
                        {714, 1853}, {126, 1854}, {1120, 1855}, {882, 1856}, {1497, 1857}, {1371, 1858},
                        {707, 1859}, {454, 1860}, {960, 1861}, {432, 1862}, {672, 1863}, {707, 1864},
                        {1778, 1865}, {825, 1866}, {1265, 1867}, {70, 1868}, {250, 1869}, {605, 1870},
                        {847, 1871}, {1582, 1872}, {1739, 1873}, {1263, 1874}, {452, 1875}, {1670, 1876},
                        {952, 1877}, {1687, 1878}, {1856, 1879}, {759, 1880}, {203, 1881}, {1425, 1882},
                        {1509, 1883}, {1816, 1884}, {473, 1885}, {868, 1886}, {163, 1887}, {1541, 1888},
                        {1565, 1889}, {468, 1890}, {1651, 1891}, {1225, 1892}, {1692, 1893}, {1461, 1894},
                        {313, 1895}, {516, 1896}, {1481, 1897}, {1114, 1898}, {390, 1899}, {638, 1900},
                        {496, 1901}, {1369, 1902}, {81, 1903}, {193, 1904}, {846, 1905}, {549, 1906},
                        {751, 1907}, {446, 1908}, {224, 1909}, {1592, 1910}, {1673, 1911}, {321, 1912},
                        {413, 1913}, {1446, 1914}, {542, 1915}, {61, 1916}, {1861, 1917}, {1695, 1918},
                        {1581, 1919}, {1065, 1920}, {1743, 1921}, {565, 1922}, {1311, 1923}, {1074, 1924},
                        {1612, 1925}, {1815, 1926}, {309, 1927}, {295, 1928}, {1117, 1929}, {592, 1930},
                        {1214, 1931}, {1403, 1932}, {1428, 1933}, {632, 1934}, {1621, 1935}, {198, 1936},
                        {21, 1937}, {694, 1938}, {100, 1939}, {1688, 1940}, {652, 1941}, {695, 1942},
                        {669, 1943}, {1220, 1944}, {1928, 1945}, {1115, 1946}, {1073, 1947}, {1479, 1948},
                        {604, 1949}, {368, 1950}, {1950, 1951}, {1631, 1952}, {347, 1953}, {1595, 1954},
                        {1837, 1955}, {1244, 1956}, {815, 1957}, {1110, 1958}, {612, 1959}, {1114, 1960},
                        {1726, 1961}, {977, 1962}, {37, 1963}, {1497, 1964}, {1031, 1965}, {592, 1966},
                        {736, 1967}, {1900, 1968}, {1811, 1969}, {797, 1970}, {1067, 1971}, {1483, 1972},
                        {595, 1973}, {1809, 1974}, {1366, 1975}, {1401, 1976}, {1036, 1977}, {341, 1978},
                        {1729, 1979}, {1270, 1980}, {1614, 1981}, {1178, 1982}, {883, 1983}, {1381, 1984},
                        {334, 1985}, {834, 1986}, {994, 1987}, {999, 1988}, {945, 1989}, {561, 1990},
                        {207, 1991}, {1031, 1992}, {1627, 1993}, {238, 1994}, {450, 1995}, {545, 1996},
                        {1322, 1997}, {1710, 1998}, {1826, 1999}};
        System.out.println(treeDiameter(edges3));
    }

    /**
     * @param edges
     * @return 参考：
     * <a href="https://leetcode.com/problems/tree-diameter/discuss/420056/Easy-BFS-same-solution-can-crack-310-207-210"></a>
     */
    public static int treeDiameter(int[][] edges) {
        if (edges.length == 0) {
            return 0;
        }
        /**
         * 记录每个节点直接连接到的节点
         */
        Map<Integer, List<Integer>> map = new HashMap<>();
        /**
         * 记录每个节点的分支数
         */
        Map<Integer, Integer> degreeMap = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int[] edge : edges) {
            map.putIfAbsent(edge[0], new LinkedList<>());
            map.get(edge[0]).add(edge[1]);
            map.putIfAbsent(edge[1], new LinkedList<>());
            map.get(edge[1]).add(edge[0]);

            degreeMap.put(edge[0], degreeMap.getOrDefault(edge[0], 0) + 1);
            degreeMap.put(edge[1], degreeMap.getOrDefault(edge[1], 0) + 1);
        }
        /**
         * 将所有只有一个分支的节点加入队列中，这些节点看做是同一层节点
         */
        for (int node : degreeMap.keySet()) {
            if (degreeMap.get(node) == 1) {
                queue.offer(node);
            }
        }

        int level = -1;
        int size = 0;

        while (!queue.isEmpty()) {
            /**
             * 该层的节点树
             */
            size = queue.size();
            /**
             * 层数，最外层为第0层
             */
            level++;

            for (int i = 0; i < size; i++) {
                int currentNode = queue.poll();

                for (int next : map.get(currentNode)) {
                    degreeMap.put(next, degreeMap.get(next) - 1);
                    /**
                     * 将内层的只剩一个分支的节点加入队列中，这些节点看做是同一层节点
                     */
                    if (degreeMap.get(next) == 1) {
                        queue.offer(next);
                    }
                }
            }
        }
        /**
         * 根据最内层节点的数量来计算层数，例如：
         * <pre>
         *     0  5
         *     |  |
         *     1  4     最内层节点数为2，最内层数为2，最大距离为5
         *     |  |
         *     2——3
         *
         *     0  3  5
         *     |  |  |     最内层节点数为1，最内层数为2，最大距离为4
         *     1——2——4
         * </pre>
         */
        return size == 2 ? level * 2 + 1 : level * 2;
    }
}