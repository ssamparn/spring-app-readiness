
INSERT INTO TODO_LIST (TODO_LIST_ID, TODO_LIST_NAME) VALUES (1, 'Languages to learn');

INSERT INTO TODO_LIST (TODO_LIST_ID, TODO_LIST_NAME) VALUES (2, 'Languages to continue learning');

INSERT INTO TODO_LIST (TODO_LIST_ID, TODO_LIST_NAME) VALUES (3, 'Languages to master');



INSERT INTO TODO_ITEM (TODO_ITEM_ID, TODO_ITEM_NAME, TODO_ITEM_COMPLETE, TODO_LIST_ID) VALUES (1, 'Kotlin', FALSE, 1);
INSERT INTO TODO_ITEM (TODO_ITEM_ID, TODO_ITEM_NAME, TODO_ITEM_COMPLETE, TODO_LIST_ID) VALUES (2, 'Swift', FALSE, 1);

INSERT INTO TODO_ITEM (TODO_ITEM_ID, TODO_ITEM_NAME, TODO_ITEM_COMPLETE, TODO_LIST_ID) VALUES (3, 'Golang', TRUE, 2);

INSERT INTO TODO_ITEM (TODO_ITEM_ID, TODO_ITEM_NAME, TODO_ITEM_COMPLETE, TODO_LIST_ID) VALUES (4, 'Java', FALSE, 3);
INSERT INTO TODO_ITEM (TODO_ITEM_ID, TODO_ITEM_NAME, TODO_ITEM_COMPLETE, TODO_LIST_ID) VALUES (5, 'Python', FALSE, 3);