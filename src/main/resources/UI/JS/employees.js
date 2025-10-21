document.addEventListener("DOMContentLoaded", () => {
    const section = document.getElementById("employees");
    section.innerHTML = `
    <h2>Employee Payroll</h2>
    <form id="empForm">
      <label>Name: <input type="text" id="empName" placeholder="John Doe"></label>
      <label>Department: <input type="text" id="empDept" placeholder="Front Desk"></label>
      <label>Pay Rate: <input type="number" id="empRate" min="10" value="20"></label>
      <label>Hours Worked: <input type="number" id="empHours" min="0" value="42"></label>
      <button type="submit">Calculate</button>
    </form>
    <p id="empOutput"></p>
  `;

    section.querySelector("#empForm").addEventListener("submit", e => {
        e.preventDefault();
        const rate = parseFloat(section.querySelector("#empRate").value);
        const hours = parseFloat(section.querySelector("#empHours").value);
        const regular = Math.min(hours, 40);
        const overtime = Math.max(0, hours - 40);
        const total = (regular * rate) + (overtime * rate * 1.5);
        section.querySelector("#empOutput").textContent = `Pay: $${total.toFixed(2)}`;
    });
});