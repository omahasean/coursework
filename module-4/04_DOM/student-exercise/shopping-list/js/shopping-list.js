// add pageTitle
const title = 'My Shopping List'
// add groceries
const groceries = [
  'Milk',
  'Bread',
  'Eggs',
  'Cheese',
  'Burger Buns',
  'Beef',
  'Toilet Paper',
  'Kleenex',
  'Chicken',
  'Rice'
];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title')
  pageTitle.innerText = title;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const listOfGroceries = document.getElementById('groceries');
    groceries.forEach((groceryItem) => {
      const groceryLi = document.createElement('li');
      groceryLi.innerText = groceryItem;
      listOfGroceries.appendChild(groceryLi);
    });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const list = Array.from(document.getElementById('groceries').children);
  list.forEach((item)=>{
    item.setAttribute('class', 'completed')
  })
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
