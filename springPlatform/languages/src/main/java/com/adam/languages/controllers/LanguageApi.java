//package com.adam.languages.controllers;

//@RestController
//public class LanguageApi {
//    private final LanguageService langService;
//    public LanguageApi(LanguageService langService){
//        this.langService = langService;
//    }
//    @RequestMapping("/api/languages")
//    public List<Language> index() {
//        return langService.allLanguages();
//    }
//    
//    @RequestMapping(value="/api/books", method=RequestMethod.POST)
//    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        Book book = new Book(title, desc, lang, numOfPages);
//        return bookService.createBook(book);
//    }
//    
//    @RequestMapping("/api/books/{id}")
//    public Book show(@PathVariable("id") Long id) {
//        Book book = bookService.findBook(id);
//        return book;
//    }
//}