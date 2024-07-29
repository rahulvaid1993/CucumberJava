package StepDefinitions;

public class Payload {

    public static String  responseBody(){
        return "{\n" +
                "    \"github\": \"https://github.com/Hipo/university-domains-list\",\n" +
                "    \"author\": {\n" +
                "        \"name\": \"hipo\",\n" +
                "        \"website\": \"http://hipolabs.com\"\n" +
                "    },\n" +
                "    \"example\": \"http://universities.hipolabs.com/search?name=middle&country=Turkey\"\n" +
                "}";
    }

    public static String response1(){

        return "[\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"Introduction to Artificial Intelligence\",\n" +
                "    \"body\": \"Learn the basics of Artificial Intelligence and its applications in various industries.\",\n" +
                "    \"link\": \"https://example.com/article1\",\n" +
                "    \"comment_count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 2,\n" +
                "    \"id\": 2,\n" +
                "    \"title\": \"Web Development with React\",\n" +
                "    \"body\": \"Build modern web applications using React.js and explore its powerful features.\",\n" +
                "    \"link\": \"https://example.com/article2\",\n" +
                "    \"comment_count\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 3,\n" +
                "    \"id\": 3,\n" +
                "    \"title\": \"Data Science Fundamentals\",\n" +
                "    \"body\": \"Dive into the world of Data Science and discover how to analyze and interpret data.\",\n" +
                "    \"link\": \"https://example.com/article3\",\n" +
                "    \"comment_count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 4,\n" +
                "    \"id\": 4,\n" +
                "    \"title\": \"Machine Learning Algorithms\",\n" +
                "    \"body\": \"Explore various Machine Learning algorithms and understand their workings.\",\n" +
                "    \"link\": \"https://example.com/article4\",\n" +
                "    \"comment_count\": 17\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 5,\n" +
                "    \"id\": 5,\n" +
                "    \"title\": \"Introduction to Blockchain\",\n" +
                "    \"body\": \"Learn about Blockchain technology, its use-cases, and how it ensures secure transactions.\",\n" +
                "    \"link\": \"https://example.com/article5\",\n" +
                "    \"comment_count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 6,\n" +
                "    \"id\": 6,\n" +
                "    \"title\": \"iOS App Development\",\n" +
                "    \"body\": \"Get started with iOS app development using Swift and create feature-rich applications.\",\n" +
                "    \"link\": \"https://example.com/article6\",\n" +
                "    \"comment_count\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 7,\n" +
                "    \"id\": 7,\n" +
                "    \"title\": \"Python for Data Analysis\",\n" +
                "    \"body\": \"Utilize Python libraries like Pandas and NumPy for data manipulation and analysis.\",\n" +
                "    \"link\": \"https://example.com/article7\",\n" +
                "    \"comment_count\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 8,\n" +
                "    \"id\": 8,\n" +
                "    \"title\": \"Cybersecurity Best Practices\",\n" +
                "    \"body\": \"Learn essential cybersecurity practices to safeguard your digital assets.\",\n" +
                "    \"link\": \"https://example.com/article8\",\n" +
                "    \"comment_count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 9,\n" +
                "    \"id\": 9,\n" +
                "    \"title\": \"Cloud Computing Essentials\",\n" +
                "    \"body\": \"Understand the fundamentals of Cloud Computing and its benefits for businesses.\",\n" +
                "    \"link\": \"https://example.com/article9\",\n" +
                "    \"comment_count\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 10,\n" +
                "    \"id\": 10,\n" +
                "    \"title\": \"Introduction to UX Design\",\n" +
                "    \"body\": \"Discover the principles of User Experience (UX) design and create intuitive user interfaces.\",\n" +
                "    \"link\": \"https://example.com/article10\",\n" +
                "    \"comment_count\": 21\n" +
                "  }\n" +
                "]";
    }


    public static String payload2(){
        return "[\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Cape Peninsula University of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"cput.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.cput.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Western Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Central University of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"cut.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.cut.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Free State Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Durban University of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"dut.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.dut.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"KwaZulu-Natal\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Nelson Mandela University\",\n" +
                "        \"domains\": [\n" +
                "            \"mandela.ac.za\",\n" +
                "            \"nmmu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.mandela.ac.za/\",\n" +
                "            \"http://www.nmmu.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Eastern Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Rhodes University\",\n" +
                "        \"domains\": [\n" +
                "            \"ru.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.ru.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Eastern Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Stellenbosch\",\n" +
                "        \"domains\": [\n" +
                "            \"sun.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.sun.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Western Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Tshwane University of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"tut.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.tut.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Cape Town\",\n" +
                "        \"domains\": [\n" +
                "            \"uct.ac.za\",\n" +
                "            \"myuct.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.uct.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Western Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Fort Hare\",\n" +
                "        \"domains\": [\n" +
                "            \"ufh.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.ufh.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Eastern Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Johannesburg\",\n" +
                "        \"domains\": [\n" +
                "            \"uj.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.uj.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of KwaZulu-Natal\",\n" +
                "        \"domains\": [\n" +
                "            \"ukzn.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.ukzn.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"KwaZulu-Natal\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Limpopo\",\n" +
                "        \"domains\": [\n" +
                "            \"ul.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.ul.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Limpopo Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of South Africa\",\n" +
                "        \"domains\": [\n" +
                "            \"unisa.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.unisa.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Venda\",\n" +
                "        \"domains\": [\n" +
                "            \"univen.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.univen.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Limpopo Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"North-West University\",\n" +
                "        \"domains\": [\n" +
                "            \"nwu.ac.za\",\n" +
                "            \"uniwest.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.nwu.ac.za/\",\n" +
                "            \"http://www.uniwest.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"North West Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of the Free State\",\n" +
                "        \"domains\": [\n" +
                "            \"uovs.ac.za\",\n" +
                "            \"ufs.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.uovs.ac.za/\",\n" +
                "            \"http://www.ufs.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Free State Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Pretoria\",\n" +
                "        \"domains\": [\n" +
                "            \"up.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.up.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of the Western Cape\",\n" +
                "        \"domains\": [\n" +
                "            \"uwc.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.uwc.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Western Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Zululand\",\n" +
                "        \"domains\": [\n" +
                "            \"unizulu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.unizulu.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"KwaZulu-Natal\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Vaal University of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"vut.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.vut.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Witwatersrand\",\n" +
                "        \"domains\": [\n" +
                "            \"wits.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.wits.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Walter Sisulu University for Technology and Science\",\n" +
                "        \"domains\": [\n" +
                "            \"wsu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.wsu.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Eastern Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Monash Univerisity South Africa\",\n" +
                "        \"domains\": [\n" +
                "            \"msa.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.msa.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Univerisity of Mpumalanga\",\n" +
                "        \"domains\": [\n" +
                "            \"ump.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.ump.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Mpumalanga Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Mangosuthu Univerisity of Technology\",\n" +
                "        \"domains\": [\n" +
                "            \"mut.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.mut.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"KwaZulu-Natal\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Sefako Makgatho Health Sciences University\",\n" +
                "        \"domains\": [\n" +
                "            \"smu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.smu.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"Sol Plaatje University\",\n" +
                "        \"domains\": [\n" +
                "            \"spu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.spu.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Northern Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"American International School of Cape Town\",\n" +
                "        \"domains\": [\n" +
                "            \"aisct.org\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"https://www.aisct.org/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Western Cape Province\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"North-West Univeristy\",\n" +
                "        \"domains\": [\n" +
                "            \"student.g.nwu.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"https://nwu.ac.za\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": null\n" +
                "    }\n" +
                "]";
    }
}
