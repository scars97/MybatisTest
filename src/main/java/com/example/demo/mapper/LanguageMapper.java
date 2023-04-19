package com.example.demo.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.Language;

@Mapper
public interface LanguageMapper {

	@Select("select * from language where language_id=#{id}")
	Language getLangs(@Param("id") Integer id);
	
	@Select("select * from language")
	List<Language> getLangsList();
	
	@Insert("insert into language values(#{langId},#{name},#{update})")
	int putLanguage(@Param("langId") Integer langId,
			@Param("name") String name,
			@Param("update") Timestamp update);
	
	@Update("update language set name=#{name}, last_update=#{update} where language_id=#{langId}")
	int postLanguage(@Param("langId") Integer langId, 
			@Param("name") String name,
			@Param("update") Timestamp update);
	
	@Delete("delete from language where language_id=#{langId}")
	int deleteLanguage(@Param("langId") Integer langId);
}
