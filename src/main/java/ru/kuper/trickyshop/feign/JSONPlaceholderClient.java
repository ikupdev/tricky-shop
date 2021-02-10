package ru.kuper.trickyshop.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kuper.trickyshop.model.Post;

import java.util.List;


@FeignClient(name = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceholderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();

//    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
//    Post getPostById(@PathVariable("postId") Long postId);


}
