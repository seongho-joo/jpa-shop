package jpabook.jpashop.service;


import static org.assertj.core.api.Assertions.assertThat;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemRepository itemRepository;

    @Test
    public void save() {
        Item item = new Book();
        item.setName("OS");
        item.setPrice(10000);
        item.setStockQuantity(100);

        itemService.saveItem(item);

        assertThat(itemRepository.findOne(1L)).isEqualTo(item);
    }
}