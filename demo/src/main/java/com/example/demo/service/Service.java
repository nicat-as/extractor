package com.example.demo.service;

import com.example.demo.dto.PreviewDto;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.UserAgent;

public class Service {
 
    public static void main(String[] args) throws Exception {
        UserAgent agent = new UserAgent();
        // agent.visit("https://spring.io/");
        agent.visit("https://www.youtube.com/watch?v=QVUjzilsfEw");
        // agent.doc.apply("spring boot").submit();
        // System.out.println(agent.doc.innerHTML());
        
        Elements links = agent.doc.findEvery("meta");

        System.out.println("Links ..... ..");
        long i=0;
        for(Element link : links) {

            System.out.println(link);
            // String title = link.getAt("title");
            // String description = link.getAt("description");
            // String image = link.getAt("image");
            // PreviewDto dto = new PreviewDto();
            // dto.setId(++i);
            // dto.setTitle(title);
            // dto.setDescription(description);
            // dto.setImageUri(image);
            // System.out.println(dto);
        }


    }
    
}