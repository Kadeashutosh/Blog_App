package com.codewithashu.blog.services;

import java.util.List;

import com.codewithashu.blog.entities.Post;
import com.codewithashu.blog.payloads.PostDto;

public interface PostService {
	
	//create 
	
	PostDto createPost(PostDto  postDto, Integer userId, Integer categoryId);
	
	
	//update 
	 
	Post updatePost(PostDto postDto, Integer postId);
	
	
	
	//delete
	
	void deletePost(Integer postId);
	
	
	
	//getAllPosts
	
	List<Post> getAllPost();
	
	
	//get Single Post
	
	Post getPostById(Integer postId);
	
	
	//getAll Post By Category
	
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	
	
	//getAll post by User 
	
	
	List<PostDto> getPostByUser(Integer userId);
	
	
	
	// Search Posts
	
	List<Post> searchPosts(String keyword);
	
	

}
